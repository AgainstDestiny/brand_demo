<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: 19578
  Date: 2022/11/5
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" href="css/login.css">
    <script src="https://cdn.staticfile.org/jquery/3.6.1/jquery.js"></script>
</head>
<body>
<div class="box">
    <form action="/LoginServlet" method="post" class="inner">
        <h2>
            Login
            <div class="err_msg">${errMsg}</div>
        </h2>
        <div class="combination">
            <label for="uname">用户名：</label><input type="text" name="username" id="uname"
                                                  value="${cookie.username.value}">
        </div>
        <div class="combination">
            <label for="pwd">密码：</label><input type="password" name="password" id="pwd"
                                               value="${cookie.password.value}">
        </div>
        <div class="combination">
            <label for="nickname">NickName：</label><input type="text" name="nickname" id="nickname"
                                                          value="${cookie.nickname.value}">
        </div>
        <div class="cd">
            <label for="gender">性别：</label>
            <select name="gender" id="gender" style="outline: none;width: 60px;border-radius: 10px">
               <% if ("男".equals(URLDecoder.decode("${cookie.gender.value}","UTF-8"))){
                   %>
                   <option value="${cookie.gender.value}" selected>男</option>
                   <option value="女">女</option>
                <%
                }else if ("女".equals(URLDecoder.decode("${cookie.gender.value}","UTF-8"))){%>
                <option value="男">男</option>
                <option value="${cookie.gender.value}" selected>女</option>
               <%
                   }else {%>
                <option value="男" selected>男</option>
                <option value="女">女</option>
                <%
                    }
                %>
            </select>
        </div>
        <div class="c">
        <label for="r">记住我</label><input type="checkbox" name="remember" id="r" value="1">
        </div>
        <div class="bottom">
            <button type="submit" class="login">登录</button>
            <button class="reg"><a href="register.jsp">注册</a></button>
        </div>
    </form>
</div>
<script>
    $(function () {
        $('.login').on('click',function () {
            $('.err_msg').show();
        })
    })
</script>
</body>
</html>
