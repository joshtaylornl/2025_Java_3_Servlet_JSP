<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<! This example uses the GET method to send the form data to the server.>
<html>
<body>
<br>

<h1>Navigate to the Servlet using parameters in a Get request</h1>

<a href="fun-with-navigation-servlet?user_name=Chaitanya&user_password=beginnersbook">Try with Get Parameters</a>

<h1>Navigate to the Servlet using parameters in a form Post request</h1>
<p>
    This example navigates based on the input. The correct login is Chaitanya
    and the password is beginnersbook <br> Try both values
</p>
<form action="fun-with-navigation-servlet" method="post">
    User Name:<input type="text" name="user_name"/><br/>
    Password:<input type="password" name="user_password"/><br/>
    <input type="submit" value="SUBMIT"/>
</form>


</body>
</html>