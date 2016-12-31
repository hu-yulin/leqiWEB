<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>

<head>

    <!-- Basic -->
    <meta charset="UTF-8"/>

    <title>商家</title>

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

    <link href="../css/shop/allGood.css" type="text/css" rel="stylesheet">
    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <%--<link href="../css/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet">--%>
    <link href="../css/club/skycons.css" type="text/css" rel="stylesheet"/>
    <link href="../font-awesome-4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/bootkit.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/jquery.mmenu.css"type="text/css" rel="stylesheet"/>
    <link href="../css/club/style.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/add-ons.min.css" type="text/css"rel="stylesheet"/>
    <script src="../js/jquery-2.1.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>

    <script src="../js/club/core.min.js"></script>

</head>

<body>

<div class="container-fluid content">
    <div class="row">
        <!--Sidebar-->
        <%@ include file="left_bar.jsp"%>
        <!--End Sidebar-->
        <!-- Main Page -->
        <div class="main ">
            <!-- Page Header -->
            <div class="page-header">
                <div class="pull-left">
                    <ol class="breadcrumb visible-sm visible-md visible-lg">
                        <li><a href="clubHomepage.jsp"><i class="fa fa-bicycle" aria-hidden="true"></i>全部商品</a></li>
                    </ol>
                </div>
            </div>
            <!-- End Page Header -->

            <div class="row" >
                <div class="col-md-12" style="margin-top: 20px">
                    <div class="container-fluid" href="#">
                        <div class="row" style="min-height: 1050px;">


                            <!--下面开始放商品-->
                            <c:forEach var="good" items="${goods}">
                                <div class="col-md-3 good_item">
                                    <div style="width: 100%;background-color: white;height: 100%">
                                        <c:forEach var="pic" items="${good.goodPicEntitySet}" begin="0" end="0">
                                            <a href="goodDetail.action?goodID=${good.goodId}">
                                                <div style="width: 100%;height: 200px; ">
                                                    <img src="../${pic.path}" style="height: 100%;width: 100%;">
                                                </div>
                                            </a>
                                        </c:forEach>
                                        <hr>
                                        <span class="good_sale">¥ ${good.currentPrice}</span><br>
                                        <span class="good_name"> 商品名:${good.name}</span>
                                        <a href="removeGood.action?goodID=${good.goodId}"><div  style="width: 100%;text-align: right;">下架</div></a>
                                    </div>
                                </div>
                            </c:forEach>


                        </div>
                    </div>
                </div>
            </div>


            <div class="row" style="margin-top:20px;">
                <div class="col-md-4 col-md-offset-4">
                    第<s:property value="currentPage"/> 页，共 <s:property value="totalPage"/>页
                    <a class="btn btn-default" href="shopGoods.action?currentPage=${currentPage-1}" role="button">上一页</a>

                    <a class="btn btn-default" href="shopGoods.action?currentPage=${currentPage+1}" role="button">下一页</a>
                </div>
            </div>

        </div>
        <!-- End Main Page -->
    </div>
</div>

</body>

</html>