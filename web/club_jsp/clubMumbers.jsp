<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <!-- Basic -->
    <meta charset="UTF-8"/>

    <title>俱乐部</title>

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>


    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/shop/choose_pic_style.css" type="text/css" rel="stylesheet">
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
    <script src="${pageContext.request.contextPath}/js/shop/picjs.js" type="text/javascript" ></script>

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

    <div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="addMember">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="gridSystemModalLabel">添加俱乐部成员</h4>
                </div>

                <form action="" method="post">
                    <div class="modal-body">
                        <div class="container-fluid">
                            <div class="row" style="margin-top:20px;">
                                <div class="col-md-10 col-md-offset-1">
                                    <div class="panel">
                                        <div class="panel-body">
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <tbody>
                                                    <tr>
                                                        <td>成员登录名</td>
                                                        <td><input type="text" class="form-control" name="club.title" placeholder="必输入"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>初始密码</td>
                                                        <td><input type="text" class="form-control" name="club.owner" placeholder="必输入"></td>
                                                    </tr>

                                                    <tr>
                                                        <td>成员名</td>
                                                        <td><input type="text" class="form-control" name="club.contact" placeholder="必输入"></td>
                                                    </tr>

                                                    <tr>
                                                        <td>性别</td>
                                                        <td>
                                                            <div class="input-group">
                                                                <input name="good.isRented" value="男" type="radio" checked="checked"
                                                                       style="margin-left: 20px">男
                                                                <input name="good.isRented" value="女" type="radio">女
                                                            </div>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td>联系方式</td>
                                                        <td><input type="text" class="form-control" style="width: 40%" name="club.province" ></td>
                                                    </tr>

                                                    <tr>
                                                        <td>所在省</td>
                                                        <td><input type="text" class="form-control" style="width: 40%" name="club.province" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td>所在市</td>
                                                        <td><input type="text" class="form-control" style="width: 40%" name="club.city" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td>所在区</td>
                                                        <td><input type="text" class="form-control" style="width: 40%" name="club.district" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td>详细地址</td>
                                                        <td><input type="text" class="form-control"  name="club.detail" ></td>
                                                    </tr>

                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="modal-footer ">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="submit" class="btn btn-primary" >提交</button>
                    </div>
                </form>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

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
                        <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#addMember">
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