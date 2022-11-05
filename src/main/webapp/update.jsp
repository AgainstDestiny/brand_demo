<%--
  Created by IntelliJ IDEA.
  User: 19578
  Date: 2022/11/5
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改品牌</title>
    <style>
        .mask{
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
        #status{
            margin-left: 15px;
        }
        .status{
            margin-left: 30px;
        }
        a{
            text-decoration: none;
            color: black;
        }
    </style>
</head>
<body>
<div class="mask">
    <div class="inner">
        <h2>修改品牌</h2>
        <div class="info">
            <form action="/UpdateServlet" method="post">
                <label for="serialNum">序号：</label><input type="text" id="serialNum" name="id" value="${brand.id}"><br>
                <label for="brandName">品牌名称：</label><input type="text" id="brandName" name="brandName"
                                                            value="${brand.brandName}"><br>
                <label for="companyName">企业名称：</label><input type="text" id="companyName" name="companyName"
                                                              value="${brand.companyName}"><br>
                <label for="ordered">排序</label><input type="text" id="ordered" name="ordered"
                                                       value="${brand.ordered}"><br>
                <label for="description">品牌介绍：<br></label><textarea name="description" id="description" cols="20"
                                                                     rows="5">${brand.description}</textarea><br>
                <label for="status" class="status">状态：</label>
                <c:if test="${brand.status == 0}">
                    <input type="radio" name="status" id="status" value="0" checked>禁用
                    <input type="radio" name="status" id="status" value="1">启用
                </c:if>

                <c:if test="${brand.status == 1}">
                    <input type="radio" name="status" id="status" value="0">禁用
                    <input type="radio" name="status" id="status" value="1" checked>启用
                </c:if>
                <div class="cd">
                    <input type="submit" value="确定">
                    <button class="cancel"><a href="/SelectAllServlet">取消</a></button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
