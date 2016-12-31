<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <!-- Basic -->
    <meta charset="UTF-8"/>

    <title>商家</title>

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>


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
    <script src="../js/shop/picjs.js" type="text/javascript" ></script>
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
                        <li><a href="clubHomepage.jsp"><i class="fa fa-info-circle" aria-hidden="true"></i>
                            </i>商品详情</a></li>
                    </ol>
                </div>
            </div>
            <!-- End Page Header -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel">
                        <div class="panel-heading bk-bg-primary" style="height: 40px">
                            <h6><i class="fa fa-group"></i><span class="break"></span>商品详情</h6>
                            <div class="panel-actions">
                                <%--<a href="table.html#" class="btn-setting"><i class="fa fa-edit"></i></a>--%>
                                <a href="table.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
                                <%--<a href="table.html#" class="btn-close"><i class="fa fa-times"></i></a>--%>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <tbody>
                                    <tr>
                                        <td>商品名</td>
                                        <td>${good.name}</td>
                                    </tr>
                                    <tr>
                                        <td>品牌</td>
                                        <td>${good.brand}</td>
                                    </tr>
                                    <tr>
                                        <td>是否可租</td>
                                        <td> <c:if test="${good.isRented==1}">
                                            是
                                            </c:if>
                                            <c:if test="${good.isRented==0}">
                                                否
                                            </c:if>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>售价</td>
                                        <td>${good.currentPrice}</td>
                                    </tr>
                                    <tr>
                                        <td>原价</td>
                                        <td>${good.originalPrice}</td>
                                    </tr>
                                    <tr>
                                        <td>商品参数</td>
                                        <td>
                                            <c:forEach items="${good.goodParameterEntitySet}" var="para">
                                                ${para.parameterValue}&nbsp;&nbsp;
                                            </c:forEach>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>商品描述</td>
                                        <td>${good.description}</td>
                                    </tr>
                                    <tr>
                                        <td>图片展示</td>
                                        <td>
                                            <c:forEach items="${good.goodPicEntitySet}" var="pic">
                                                <img src="../${pic.path}" style="max-width: 200px;margin-top: 10px;margin-right: 10px"/>
                                            </c:forEach>



                                        </td>
                                    </tr>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Main Page -->
    </div>
</div>

</body>

</html>