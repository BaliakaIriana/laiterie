<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign in</title>
</head>
<body>
	<s:form action="signin">
		<s:textfield label="Adresse électronique" name="user.email"></s:textfield>
		<s:textfield label="Mot de passe" name="user.password"></s:textfield>
		<s:submit value="Connexion"></s:submit>
	</s:form>
</body>
</html>