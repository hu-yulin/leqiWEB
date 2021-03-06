<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/26
  Time: 20:22
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
    <script src="${pageContext.request.contextPath}js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}js/bootstrap.min.js" type="text/javascript" ></script>

</head>
<body>
    <%@ include file="left_bar.jsp"%>

    <div id="right-content" class="right-content">
        <div class="content">
            <div id="page_content">

                <div class="cp_title">商家详情</div>

                <div class="table_tit" style="padding-bottom: 0px;margin-top: 40px">
                    <table>
                        <tr class="tb_title">
                            <td width="20%">属性</td>
                            <td width="70%">值</td>

                        </tr>
                    </table>
                </div>

                <div class="table_con" style="margin-top:90px">
                    <table class="showAnn">
                        <tr >
                            <td width="20%">商家名</td>
                            <td width="70%">${shopInfo.shopName}</td>
                        </tr>
                        <tr >
                            <td width="20%">商家地址</td>
                            <td width="70%">${shopInfo.province}-${shopInfo.city}-${shopInfo.district}-${shopInfo.detail}</td>
                        </tr>
                        <tr >
                            <td width="20%">店主</td>
                            <td width="70%">${shopInfo.ownerName}</td>
                        </tr>
                        <tr >
                            <td width="20%">联系方式</td>
                            <td width="70%">${shopInfo.tel}</td>
                        </tr>
                        <tr >
                            <td width="20%">商家等级</td>
                            <td width="70%">${shopInfo.level}</td>
                        </tr>
                        <tr >
                            <td width="20%">商家描述</td>
                            <td width="70%">${shopInfo.description}</td>
                        </tr>
                        <tr >
                            <td width="20%">商品数量</td>
                            <td width="70%">${goodsCount}</td>
                        </tr>
                        <tr >
                            <td width="20%"><button type="button" class="btn btn-info">发送信息</button></td>
                        </tr>
                    </table>
                </div>

            </div>
        </div>
    </div>



</body>
</html>
