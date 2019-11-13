<%--
  Created by IntelliJ IDEA.
  User: tymazey
  Date: 2019-11-13
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h1>CO-AUTHORS</h1>
<form action = "/Commit_Template_war/template-submit" method = "POST" >
    First Co-Author: <input type = "text" name = "coAuthor-1">
    <br />
    Second Co-Author: <input type = "text" name = "coAuthor-2" />
    <br />
    Third Co-Author: <input type = "text" name = "coAuthor-3" />
    <br />
    <input type = "submit" value = "Submit" />
</form>

</body>
</html>
