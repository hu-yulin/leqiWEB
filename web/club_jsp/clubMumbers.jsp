<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <!-- Basic -->
    <meta charset="UTF-8"/>

    <title>俱乐部</title>

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>


    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/choose_pic_style.css" type="text/css" rel="stylesheet">
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
    <script src="../js/shop/picjs.js" type="text/javascript" ></script>

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
                        <li class="active"><i class="fa fa-group"></i>成员</li>
                    </ol>
                </div>
                <div class="pull-right">
                    <h2 id="tag">
                        <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#">
                            添加成员
                        </button></h2>
                </div>
            </div>
            <!-- End Page Header -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel">
                        <div class="panel-heading bk-bg-primary" style="height: 40px">
                            <h6><i class="fa fa-group"></i><span class="break"></span>成员</h6>
                            <div class="panel-actions">
                                <%--<a href="table.html#" class="btn-setting"><i class="fa fa-edit"></i></a>--%>
                                <a href="table.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
                                <%--<a href="table.html#" class="btn-close"><i class="fa fa-times"></i></a>--%>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered bootstrap-datatable datatable">
                                    <thead>
                                    <tr>
                                        <th>成员名</th>
                                        <th>性别</th>
                                        <th>联系方式</th>
                                        <th>地区</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${riders}" var="rider">
                                        <tr>
                                            <td>${rider.nickname}</td>
                                            <td>${rider.gender}</td>
                                            <td>${rider.contact}</td>
                                            <td>${rider.province}-${rider.city}-${rider.district}-${rider.detail}</td>
                                            <td> <a href="" class="btn btn-info" role="button">删除</a></td>
                                        </tr>
                                    </c:forEach>
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