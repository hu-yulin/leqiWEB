<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/26
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>后台管理</title>
    <meta charset="UTF-8">
    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/manage/Iframe.css" type="text/css" rel="stylesheet">
    <link href="../css/manage/index1.css" type="text/css" rel="stylesheet">
    <script src="../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.min.js" type="text/javascript" ></script>

</head>
<body>
<%@ include file="left_bar.jsp"%>
<div id="right-content" class="right-content">
    <div class="content">
        <div id="page_content">

            <div class="cp_title">个人用户列表 &nbsp;&nbsp;共计：${count}</div>

            <div class="table_tit" style="padding-bottom: 0px;margin-top: 40px">
                <table>
                    <tr class="tb_title">
                        <td width="10%">用户ID</td>
                        <td width="20%">用户名</td>
                        <td width="20%">用户联系方式</td>
                        <td width="40%">用户地址</td>
                        <td width="10%">操作</td>
                    </tr>
                </table>
            </div>

            <div class="table_con" style="margin-top:90px">
                <table class="showAnn">
                    <tr >
                        <c:forEach items="${allRiders}" var="rider">
                            <td width="10%">${rider.riderId}</td>
                            <td width="20%">${rider.nickNmae}</td>
                            <td width="20%">${rider.contact}</td>
                            <td width="40%">${rider.province}-${rider.city}-${rider.district}-${rider.detail}</td>
                            <td width="10%">
                                <a href="ID=${rider.riderId}" class="btn btn-info" role="button">？操作</a>
                            </td>
                        </c:forEach>
                    </tr>
                </table>
            </div>

        </div>
    </div>
</div>
</body>
</html>
