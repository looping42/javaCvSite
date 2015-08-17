<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="javaCVSite.Message" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>News</title>
</head>
<body>
		<h1>Vous avez aimé mon site ? Dites-le dans le Datastore !</h1>
		<form action="/news" method="post">
			<p>
				<label>Votre nom : <input type="text" name="name" /></label>
			</p>
			<p>
				<label>Votre message :<br />
				<textarea name="message" style="width: 200px; height: 100px;"></textarea></label>
			</p>
			<p>
				<input type="submit" />
			</p>
		</form>
	
		<h1>Ils ont aimé :</h1>
		<%
			List<Message> messages = (List<Message>) request.getAttribute("messages");
			for (Message message : messages) {
		%>
		<p>
			<strong><%= message.getName() %></strong> a écrit :<br />
			<%= message.getMessage() %>
		</p>
		<%
			}
		%>
</body>
</html>