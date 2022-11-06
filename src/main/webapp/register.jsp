<%--
  Created by IntelliJ IDEA.
  User: 19578
  Date: 2022/11/5
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>注册页面</title>
    <link rel="stylesheet" href="./css/register.css">
    <script src="https://cdn.staticfile.org/jquery/3.6.1/jquery.js"></script>
</head>
<body>
<div class="box">
    <form action="/CheckServlet" method="post" class="inner">
        <h2>
            REGISTER
            <div class="err_msg">${str}</div>
            <div class="success_msg">${success}</div>
        </h2>
        <div class="combination">
            <label for="uname">用户名：</label><input type="text" name="username" id="uname">
        </div>
        <div class="combination">
            <label for="pwd">密码：</label><input type="password" name="password" id="pwd">
        </div>
        <div class="combination">
            <label for="nickname">NickName：</label><input type="text" name="nickname" id="nickname">
        </div>
        <div class="cd">
            <label for="gender">性别：</label>
            <select name="gender" id="gender" style="outline: none;width: 60px;border-radius: 10px">
                <option value="女">女</option>
                <option selected value="男">男</option>
            </select>
        </div>
        <div class="combination">
        <label for="check">验证码</label>
            <input type="text" id="check" name="captcha">
            <a href="">
                <img src="/CaptchaServlet" alt="" id="img">
            </a>
        </div>
        <div class="bottom">
            <button type="submit" class="reg">注册</button>
            <button class="loginBack"><a href="login.jsp">返回登录</a></button>
        </div>
    </form>
</div>
<script>
</script>
</body>
</html>
