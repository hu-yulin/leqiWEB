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
    <link href="${pageContext.request.contextPath}/css/shop/choose_pic_style.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/shop/allGood.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <%--<link href="../css/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet">--%>
    <link href="${pageContext.request.contextPath}/css/club/skycons.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/font-awesome-4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/club/bootkit.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/club/jquery.mmenu.css"type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/club/style.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/club/add-ons.min.css" type="text/css"rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/shop/picjs.js" type="text/javascript" ></script>
    <script src="${pageContext.request.contextPath}/js/club/core.min.js"></script>
    <script>
        $(".user_icon input[type='file']").bind("change",function () {
            var file=this.files[0];
            var icon=$(this).parent();
            var imageType = /image.*/;
            if(file.type.match(imageType)){
                var reader = new FileReader();
                reader.onload = (function(aDiv){
                    return function(e) {
                        aDiv.css("background", "url(" + e.target.result + ") no-repeat center");
                        aDiv.css("background-size", "cover");
                    }
                })(icon);
                reader.readAsDataURL(file);
            }

        })
    </script>
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
                        <li><i class="fa fa-bicycle" aria-hidden="true"></i>全部商品</li>
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

                                <div class="col-md-3" style="margin-bottom: 20px;overflow: hidden;">
                                    <div class="panel">
                                        <div class="panel-heading bk-bg-primary" style="height: 40px;">
                                            <h6><i class="fa fa-table red"></i><span class="break"></span>商品</h6>
                                            <div class="panel-actions">
                                            </div>
                                        </div>
                                        <div class="panel-body">
                                            <div class="table-responsive">
                                                <c:forEach var="pic" items="${good.goodPicEntitySet}" begin="0" end="0">
                                                    <a href="goodDetail.action?goodID=${good.goodId}">
                                                        <div style="width: 100%;height: 200px; ">
                                                            <img src="${pageContext.request.contextPath}/${pic.path}" style="height: 100%;width: 100%;">
                                                        </div>
                                                    </a>
                                                </c:forEach>
                                                <hr>
                                                <span class="good_sale">¥ ${good.currentPrice}</span><br>
                                                <span class="good_name"> 商品名:${good.name}</span>
                                                <a href="removeGood.action?goodID=${good.goodId}"><div  style="width: 100%;text-align: right;color: #0a0a0a">下架</div></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <%--<div class="col-md-3 good_item">--%>
                                    <%--<div style="width: 100%;background-color: white;height: 100%">--%>
                                        <%--<c:forEach var="pic" items="${good.goodPicEntitySet}" begin="0" end="0">--%>
                                            <%--<a href="goodDetail.action?goodID=${good.goodId}">--%>
                                                <%--<div style="width: 100%;height: 200px; ">--%>
                                                    <%--<img src="${pageContext.request.contextPath}/${pic.path}" style="height: 100%;width: 100%;">--%>
                                                <%--</div>--%>
                                            <%--</a>--%>
                                        <%--</c:forEach>--%>
                                        <%--<hr>--%>
                                        <%--<span class="good_sale">¥ ${good.currentPrice}</span><br>--%>
                                        <%--<span class="good_name"> 商品名:${good.name}</span>--%>
                                        <%--<a href="removeGood.action?goodID=${good.goodId}"><div  style="width: 100%;text-align: right;">下架</div></a>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
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