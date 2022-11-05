<%@ page import="java.util.List" %>
<%@ page import="cn.itaxu.pojo.Brand" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 19578
  Date: 2022/11/4
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>品牌数据</title>
    <script src="https://cdn.staticfile.org/jquery/3.6.1/jquery.js"></script>
    <style>
        .mask{
            display: none;
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            background: rgba(0,0,0,.5);
        }
        .inner{
            width: 500px;
            height: 500px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%,-50%);
            background-color: #ffffff;
            border-radius: 20px;
        }
        #serialNum{
            margin-left: 32px;
        }
        #ordered{
            margin-left: 48px;
        }
        #description{
            margin-left: 80px;
        }
        .cd{
            margin: 30px 0 0 85px;
            width: 150px;
            height: 50px;
            display: flex;
            justify-content: space-between;
        }
        .info{
            margin-left: 90px;
        }
       .cd button,.cd input{
            width: 60px;
            cursor: pointer;
            border: none;
            outline: none;
            border-radius: 10px;
            background-color: rgba(0,0,0,.3);
        }
        input{
            outline: none;
        }
       .cd button:hover,.cd input:hover{
            color: #fff;
        }
        h2{
            text-align: center;
        }
        .add{
            cursor: pointer;
        }
        #status{
            margin-left: 15px;
        }
        .status{
            margin-left: 30px;
        }
        .mask1{
            display: none;
        }
    </style>
</head>
<body>
<input type="button" value="新增" class="add"><br>
<div class="mask">
    <div class="inner">
        <h2>添加品牌</h2>
        <div class="info">
            <form action="/AddServlet" method="post">
        <label for="serialNum">序号：</label><input type="text" id="serialNum" name="id"><br>
        <label for="brandName">品牌名称：</label><input type="text" id="brandName" name="brandName"><br>
        <label for="companyName">企业名称：</label><input type="text" id="companyName" name="companyName"><br>
        <label for="ordered">排序</label><input type="text" id="ordered" name="ordered"><br>
        <label for="description">品牌介绍：<br></label><textarea name="description" id="description" cols="20"
                                                            rows="5"></textarea><br>
                <label for="status" class="status">状态：</label>
                <input type="radio" name="status" id="status" value="0">禁用
                <input type="radio" name="status" value="1">启用
                <div class="cd">
                    <input type="submit" value="确定">
                    <button class="cancel">取消</button>
                </div>
            </form>
        </div>
    </div>
</div>
<hr>
<table border="1px solid #000" cellspacing="0" cellpadding="5px">
    <tr align="center">
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>

  <c:forEach items="${brands}" var="brand">
    <tr align="center">
        <td>${brand.getId()}</td>
        <td>${brand.getBrandName()}</td>
        <td>${brand.getCompanyName()}</td>
        <td>${brand.getOrdered()}</td>
        <td>${brand.getDescription()}</td>
        <td>${brand.getStatusStr()}</td>
        <td><a href="/SelectByIdServlet?id=${brand.id}">修改</a> <a href="#">删除</a></td>
    </tr>
  </c:forEach>
</table>
<script>
    $(function () {
        $('.cd').on('click','button,input',function () {
            $('.mask').hide()
        });
        $('.add').on('click',function () {
            $('.mask').show()
        });
    })
</script>
</body>
</html>
