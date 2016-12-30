<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/29
  Time: 14:37
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

                <div class="cp_title">俱乐部列表 &nbsp;&nbsp;共计：${clubsCount}</div>

                <div class="table_tit" style="padding-bottom: 0px;margin-top: 40px">
                    <table>
                        <tr class="tb_title">
                            <td width="20%">俱乐部名</td>
                            <td width="70%">俱乐部简介简介</td>
                            <td width="10%">操作</td>
                        </tr>
                    </table>
                </div>

                <div class="table_con" style="margin-top:90px">
                    <table class="showAnn">
                        <tr >
                            <c:forEach items="${allClubs}" var="club">
                                <td width="20%">${club.title}</td>
                                <td width="70%">${club.description}</td>

                                <td width="10%">
                                    <a href="managementClubInfo.action?clubID=${club.clubId}" class="btn btn-info" role="button">查看详情</a>
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
