<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.revature.model.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handling Request</title>
</head>
<body>
<%!String username,email;
Person person;
%>
<% username=request.getParameter("username");
email=request.getParameter("mail");
person=new Person(username,email);
%>

<h3>Hello <%=username  %> your email is <%=email %></h3>
<h3>Hello Again <%=person.getUsername()  %> your email is <%=person.getEmail() %></h3>

<jsp:useBean id="p1" class="com.revature.model.Person"></jsp:useBean>
<jsp:setProperty property="username" name="p1" value="<%=username %>"/>
"Dispalying" <jsp:getProperty property="username" name="p1"/>
<
</body>
</html>