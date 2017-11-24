<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>

<form action="${pageContext.request.contextPath}/get"
      method="GET">
    <h3>Welcome :</h3>

    <form action = "main.jsp" method = "GET">
        Login: <input type = "text" name = "login">
        <br />
        Password: <input type = "text" name = "password" />
        <input type = "submit" value = "Submit" />
    </form>

</form>
</html>
