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
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/manage/Iframe.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/manage/index1.css" type="text/css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript" ></script>

</head>
<body>
    <%@ include file="left_bar.jsp"%>
    <div id="right-content" class="right-content">
        <div class="content">
            <div id="page_content">

                <div class="cp_title">商家列表 &nbsp;&nbsp;共计：${shopsCount}</div>

                <div class="table_tit" style="padding-bottom: 0px;margin-top: 40px">
                    <table>
                        <tr class="tb_title">
                            <td width="20%">商家名</td>
                            <td width="70%">商家简介</td>
                            <td width="10%">操作</td>
                        </tr>
                    </table>
                </div>

                <div class="table_con" style="margin-top:90px">
                    <table class="showAnn">
                        <tr >
                            <c:forEach items="${shops}" var="shop">
                                <td width="20%">${shop.shopName}</td>
                                <td width="70%">${shop.description}</td>

                                <td width="10%">
                                    <a href="managementShopInfo.action?shopID=${shop.shopId}" class="btn btn-info" role="button">查看详情</a>
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
