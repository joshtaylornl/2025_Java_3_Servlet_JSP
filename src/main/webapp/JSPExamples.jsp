<%@ page import="java.net.http.HttpRequest" %><%--
  Created by IntelliJ IDEA.
  User: Josh
  Date: 2022-05-30
  Time: 9:09 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Examples</title>
</head>
<body>

<%-- Declare a variable in a Scriplet --%>
<%! String string ="Hello World!"; %>

<p>
    <%-- Expression --%>
    <b>1) Example of an Expression: </b>
        </br>
    Current time is: <%= new java.util.Date() %>
</p>

<p>
    <%-- Scriplet with reference to a variable --%>
    2) An Example of a Scriplet:
    <% out.print(string + "... Sample JSP code"); %>
</p>

<p>
    3) Example of an If/Else inline: </br>
</p>

<%
    if(string.equals("Hello Cruel World!")){
        %>Strings match!<%
    }
    else {
        out.print("strings don't match");
    }
%>

</br>

<%-- JSP Implicit Objects
Play around with:
    out
    session
    request
    response

    exception - only accessible if the page is set as an error page by: <%@ page isErrorPage="true" %>
--%>
<p>
<%
    out.println("4) This out is an implicit Object <br>");
    //TODO Test other Implicit Objects

    application.setAttribute("name", "Josh");

%>
</p>

</body>
</html>
