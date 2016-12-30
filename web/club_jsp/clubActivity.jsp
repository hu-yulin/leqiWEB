<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <%--<link href="../css/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet">--%>
    <link href="../css/club/skycons.css" type="text/css" rel="stylesheet"/>
    <link href="../font-awesome-4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/bootkit.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/jquery.mmenu.css"type="text/css" rel="stylesheet"/>
    <link href="../css/club/style.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/add-ons.min.css" type="text/css"rel="stylesheet"/>

</head>

<body>

<div class="container-fluid content">
    <div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="releaseActivity">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="gridSystemModalLabel">发布活动</h4>
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
                                                        <td>活动名</td>
                                                        <td><input type="text" class="form-control" placeholder="活动名"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>活动描述</td>
                                                        <td><textarea class="form-control" rows="5" style="resize:none;"></textarea></td>
                                                    </tr>
                                                    <tr>
                                                        <td>起始时间</td>
                                                        <td>
                                                            <input type="text" class="form-control" placeholder="yyy-mm-dd">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>结束时间</td>
                                                        <td>
                                                            <input type="text" class="form-control" placeholder="yyy-mm-dd">
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td>活动起始地点</td>
                                                        <td><input type="text" class="form-control" placeholder="起始地点"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>活动参与方式</td>
                                                        <td><input type="text" class="form-control" placeholder="参与方式"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>活动要求</td>
                                                        <td><input type="text" class="form-control" placeholder="活动要求"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>上传图片</td>
                                                        <td>
                                                            <div class="container-fluid">
                                                                <div class="row" >
                                                                    <div class="col-md-12">
                                                                        <div class="panel panel-default " >
                                                                            <div class="panel-body text-center">

                                                                                <div class="file_item">
                                                                                    <input type="file">
                                                                                </div>

                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>

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
                        <li><a href="clubHomepage.jsp"><i class="icon fa fa-home"></i>主页</a></li>
                        <li class="active"><i class="fa fa-bicycle"></i>活动</li>
                    </ol>
                </div>
                <div class="pull-right">
                    <h2 id="tag">
                        <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#releaseActivity">
                            添加活动
                        </button>
                     </h2>
                </div>
            </div>
            <!-- End Page Header -->
            <div id="fade" class="black_overlay"></div>

            <div class="row">

                <div class="col-lg-6">
                    <div class="panel">
                        <div class="panel-heading bk-bg-primary" style="height: 40px;">
                            <h6><i class="fa fa-table red"></i><span class="break"></span>XX活动</h6>
                            <div class="panel-actions">
                                <%--<a href="table.html#" class="btn-setting"><i class="fa fa-edit"></i></a>--%>
                                <a href="table.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
                                <a href="table.html#" class="btn-close"><i class="fa fa-times"></i></a>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <tbody>
                                    <tr>
                                        <td>活动名</td>
                                        <td>XX活动</td>
                                    </tr>
                                    <tr>
                                        <td>活动描述</td>
                                        <td>balabala</td>
                                    </tr>
                                    <tr>
                                        <td>活动时间</td>
                                        <td>2015年12月12日09:40:35——2016年12月29日09:40:22</td>
                                    </tr>
                                    <tr>
                                        <td>活动起始地点</td>
                                        <td>辽宁省沈阳市浑南区东北大学二舍B</td>
                                    </tr>
                                    <tr>
                                        <td>活动参与方式</td>
                                        <td>报名</td>
                                    </tr>
                                    <tr>
                                        <td>活动要求</td>
                                        <td>身高1米6</td>
                                    </tr>
                                    <tr>
                                        <td>活动参与者</td>
                                        <td><p>
                                            胡玉林 闫新跃 张靖<br>
                                            胡玉林 闫新跃 张靖<br>
                                            胡玉林 闫新跃 张靖<br>
                                        </p></td>
                                    </tr>
                                    <tr>
                                        <td>活动展示</td>
                                        <td><img src="images/avatar.jpg"/></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="col-lg-6">
                    <div class="panel">
                        <div class="panel-heading bk-bg-primary" style="height: 40px;">
                            <h6><i class="fa fa-table red"></i><span class="break"></span>XX活动</h6>
                            <div class="panel-actions">
                                <%--<a href="table.html#" class="btn-setting"><i class="fa fa-edit"></i></a>--%>
                                <a href="table.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
                                <a href="table.html#" class="btn-close"><i class="fa fa-times"></i></a>
                            </div>
                            <div style="float: right;padding-top: 12px">
                                <span class="pull-right label label-primary" >参加人数：9</span>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <tbody>
                                    <tr>
                                        <td>活动名</td>
                                        <td>XX活动</td>
                                    </tr>
                                    <tr>
                                        <td>活动描述</td>
                                        <td>balabala</td>
                                    </tr>
                                    <tr>
                                        <td>活动时间</td>
                                        <td>2015年12月12日09:40:35——2016年12月29日09:40:22</td>
                                    </tr>
                                    <tr>
                                        <td>活动起始地点</td>
                                        <td>辽宁省沈阳市浑南区东北大学二舍B</td>
                                    </tr>
                                    <tr>
                                        <td>活动参与方式</td>
                                        <td>报名</td>
                                    </tr>
                                    <tr>
                                        <td>活动要求</td>
                                        <td>身高1米6</td>
                                    </tr>
                                    <tr>
                                        <td>活动参与者</td>
                                        <td><p>
                                            胡玉林 闫新跃 张靖<br>
                                            胡玉林 闫新跃 张靖<br>
                                            胡玉林 闫新跃 张靖<br>
                                        </p></td>
                                    </tr>
                                    <tr>
                                        <td>活动展示</td>
                                        <td><img src="images/avatar.jpg"/></td>
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


<script src="../js/jquery-2.1.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<%--<script src="../js/bootstrap-datetimepicker.fr.js"></script>--%>
<%--<script src="../js/bootstrap-datetimepicker.min.js"></script>--%>
<script src="../js/shop/picjs.js" type="text/javascript" ></script>
<script src="../js/club/core.min.js"></script>
<script type="text/javascript">
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

    });
</script>
</body>

</html>