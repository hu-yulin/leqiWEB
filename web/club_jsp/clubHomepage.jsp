<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

    <!-- Basic -->
    <meta charset="UTF-8"/>
    <title>俱乐部</title>

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

    <link rel="shortcut icon" href="images/icon/c-check-1-l-280x280.png" type="image/x-icon"/>

    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/choose_pic_style.css" type="text/css" rel="stylesheet">
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


    <style type="text/css">
        .modify_button{
            font-size: 12px;
            text-align: end;
            border: 0px;
            background-color: inherit;
        }
    </style>

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

    <div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="changeClubInfo">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="gridSystemModalLabel">更改基本信息</h4>
                </div>

                <form action="modifyClubInfo.action?clubID=${club.clubId}" method="post">
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
                                                        <td>俱乐部名</td>
                                                        <td><input type="text" class="form-control" name="club.title" value="${club.title}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>俱乐部负责人</td>
                                                        <td><input type="text" class="form-control" name="club.owner" value="${club.owner}"></td>
                                                    </tr>

                                                    <tr>
                                                        <td>俱乐部联系方式</td>
                                                        <td><input type="text" class="form-control" name="club.contact" value="${club.contact}"></td>
                                                    </tr>

                                                    <tr>
                                                        <td>所在省</td>
                                                        <td><input type="text" class="form-control" style="width: 40%" name="club.province" value="${club.province}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>所在市</td>
                                                        <td><input type="text" class="form-control" style="width: 40%" name="club.city" value="${club.city}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>所在区</td>
                                                        <td><input type="text" class="form-control" style="width: 40%" name="club.district" value="${club.district}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>详细地址</td>
                                                        <td><input type="text" class="form-control"  name="club.detail" value="${club.detail}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>俱乐部描述</td>
                                                        <td>
                                                            <textarea class="form-control" rows="5" name="club.description" style="resize:none;">${club.description}</textarea>
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
                    </div>
                    <div class="modal-footer ">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="submit" class="btn btn-primary" >提交</button>
                    </div>
                </form>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="changePass">
        <div class="modal-dialog modal-sm" role="document">
            <div class="modal-content">
                <form action="" method="post" >
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" >更改密码</h4>
                    </div>
                    <div class="modal-body">
                        <div class="container-fluid">
                            <div class="row" style="margin-top: 20px;">
                                <div class="col-md-12 ">
                                    <div class="input-group">
                                        <span class="input-group-addon" >密&nbsp;&nbsp;&nbsp;&nbsp;码：</span>
                                        <input  class="form-control" aria-describedby="sizing-addon2" name="pass" />
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div class="modal-footer ">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="submit" class="btn btn-primary" >保存</button>
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
                        <li><i class="icon fa fa-home"></i>主页</li>
                    </ol>
                </div>
                <div class="pull-right">
                    <h2 id="tag">俱乐部</h2>
                </div>
            </div>
            <!-- End Page Header -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel">
                        <div class="panel-heading bk-bg-primary" style="height: 48px;">
                            <h6><i class="fa fa-table red"></i><span class="break"></span>${club.title}</h6>
                            <div class="panel-actions">
                                <button type="button" class="modify_button" data-toggle="modal" data-target="#changeClubInfo">修改基本信息</button>
                                <button type="button" class="modify_button" data-toggle="modal" data-target="#changePass">修改密码</button>
                            </div>


                            <!--<div class="panel-actions">-->
                                <!--<a href="table.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>-->
                                <!--<a href="table.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>-->
                                <!--<a href="table.html#" class="btn-close"><i class="fa fa-times"></i></a>-->
                            <!--</div>-->
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered bootstrap-datatable datatable">
                                    <tbody style="text-align: left">
                                    <tr>
                                        <td>俱乐部名</td>
                                        <td>${club.title}</td>
                                    </tr>
                                    <tr>
                                        <td>俱乐部ID</td>
                                        <td>${club.clubId}</td>
                                    </tr>
                                    <tr>
                                        <td>所有人</td>
                                        <td>${club.owner}</td>
                                    </tr>
                                    <tr>
                                        <td>俱乐部等级</td>
                                        <td>${club.level}</td>
                                    </tr>
                                    <tr>
                                        <td>联系方式</td>
                                        <td>${club.contact}</td>
                                    </tr>
                                    <tr>
                                        <td>所在地</td>
                                        <td>${club.province}-${club.city}-${club.district}-${club.detail}</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">俱乐部描述</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">${club.description}</td>
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