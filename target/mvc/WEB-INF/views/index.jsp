<%--
  Created by IntelliJ IDEA.
  User: tymazey
  Date: 2019-11-12
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
</head>
<body>
<p>
    Well, hello there!
</p>
<p>
    We're going to now talk to the GitHub API. Ready?
    <a href='https://github.com/login/oauth/authorize?scope=user:email&client_id=${client_id}'>Click here</a> to begin!</a>
</p>
<p>
    If that link doesn't work, remember to provide your own <a href="/apps/building-oauth-apps/authorizing-oauth-apps/">Client ID</a>!
</p>
</body>
</html>

