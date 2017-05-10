package s6.frameop.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import s6.frameop.object.Utilisateur;
import s6.frameop.service.SingletonService;
import s6.frameop.service.UtilisateurService;

public class SessionAction extends ActionSupport {
	UtilisateurService service = SingletonService.getUserservice();
	private String message;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Utilisateur user = new Utilisateur();
	public String loginview(){
		return SUCCESS;
	}
	public String login(){
		try {
			Utilisateur logged = service.connect(user.getEmail(), user.getPassword());
			System.out.println(logged);
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("logged", logged);
			return SUCCESS;
		} catch (Exception e) {
			setMessage(e.getMessage());
			System.out.println(getMessage());
			return ERROR;
		}
	}
	
	public String logout(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		session.remove("logged");
		return SUCCESS;
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
