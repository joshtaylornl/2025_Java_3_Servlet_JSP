<%@ page import="ca.nl.cna.java3.servlet.session.Foo" %><%--
  Created by IntelliJ IDEA.
  User: josh.taylor
  Date: 2/22/2024
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Foo foo = (Foo) request.getSession().getAttribute(Foo.NAME);
%>

foo is <%= foo == null ? "No foo" : foo.toString() %>

<form action = "fun-with-http-sessions" method = "put">
    Foo Id: <input type = "text" name = "foo_id">
    <br />
    Value: <input type = "text" name = "foo_value" />
    <input type = "submit" value = "Submit" />
</form>

</body>
</html>
