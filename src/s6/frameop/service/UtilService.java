package s6.frameop.service;

import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class UtilService {
	final static String HOST = "127.0.0.1";
	private final static ResourceBundle smtpBundle = ResourceBundle.getBundle("smtp");
	public static void sendMail(String to,String from,String messageStr,String subject){
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", HOST);
		props.setProperty("mail.smtp.port", "587");
		props.setProperty("mail.smtp.auth", "true");
//		Properties props = new Properties();
//		props.put("mail.smtp.host", smtpBundle.getString("mail.smtp.host"));
//        props.put("mail.smtp.socketFactory.port", smtpBundle.getString("mail.smtp.socketFactory.port"));
//        props.put("mail.smtp.socketFactory.class", smtpBundle.getString("mail.smtp.socketFactory.class"));
//        props.put("mail.smtp.auth", smtpBundle.getString("mail.smtp.auth"));
//        props.put("mail.smtp.port", smtpBundle.getString("mail.smtp.port"));
		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(smtpBundle.getString("mail.session.user"), smtpBundle.getString("mail.session.pass"));
            }
        });
//		Session session = Session.getDefaultInstance(props);
		try {
	         // Create a default MimeMessage object.

			MimeMessage message = new MimeMessage(session);
			message.setHeader("content-type", "text/html");
			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));
			
			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			// Set Subject: header field
			message.setSubject(subject);
			
			// Now set the actual message
			message.setText(messageStr);
			
			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		}catch (MessagingException mex) {
			  mex.printStackTrace();
		}
	}
}
