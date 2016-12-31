<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

    <!-- Basic -->
    <meta charset="UTF-8"/>
    <title>商家</title>

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

    <link rel="shortcut icon" href="images/icon/c-check-1-l-280x280.png" type="image/x-icon"/>

    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/club/skycons.css" type="text/css" rel="stylesheet"/>
    <link href="../font-awesome-4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/bootkit.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/jquery.mmenu.css"type="text/css" rel="stylesheet"/>
    <link href="../css/club/style.css" type="text/css" rel="stylesheet"/>
    <link href="../css/club/add-ons.min.css" type="text/css"rel="stylesheet"/>
    <style type="text/css">
        .modify_button{
            font-size: 12px;
            text-align: end;
            border: 0px;
            background-color: inherit;
        }
    </style>
</head>

<body>

<div class="container-fluid content">

    <div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="change_shop_info">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="gridSystemModalLabel">修改店铺信息</h4>
                </div>

                <form action="modifyShopInfo.action" method="post">
                    <div class="modal-body">
                        <div class="container-fluid">
                            <div class="row" style="margin-top:20px;">
                                <div class="col-md-10 col-md-offset-1">
                                    <div class="input-group">
                                        <span class="input-group-addon" >店铺名：</span>
                                        <input type="text" class="form-control"  aria-describedby="sizing-addon2" name="shop.shopName" value="${shop.shopName}"/>
                                    </div>
                                </div>
                            </div>

                            <div class="row" style="margin-top:10px;">
                                <div class="col-md-3 col-md-offset-1">
                                    <div class="input-group">
                                        <span class="input-group-addon" >店铺省：</span>
                                        <input type="text" class="form-control"  aria-describedby="sizing-addon2" name="shop.province" value="${shop.province}"/>
                                    </div>
                                </div>
                                <div class="col-md-3 col-md-offset-1">
                                    <div class="input-group">
                                        <span class="input-group-addon" >市：</span>
                                        <input type="text" class="form-control"  aria-describedby="sizing-addon2" name="shop.city" value="${shop.city}"/>
                                    </div>
                                </div>
                                <div class="col-md-3 col-md-offset-1">
                                    <div class="input-group">
                                        <span class="input-group-addon" >区：</span>
                                        <input type="text" class="form-control"  aria-describedby="sizing-addon2" name="shop.district" value="${shop.district}"/>
                                    </div>
                                </div>
                            </div>

                            <div class="row" style="margin-top:10px;">
                                <div class="col-md-10 col-md-offset-1">
                                    <div class="input-group">
                                        <span class="input-group-addon" >店铺具体地址：</span>
                                        <input type="text" class="form-control"  aria-describedby="sizing-addon2" name="shop.detail" value="${shop.detail}"/>
                                    </div>
                                </div>
                            </div>

                            <div class="row" style="margin-top:10px;">
                                <div class="col-md-10 col-md-offset-1">
                                    <div class="input-group">
                                        <span class="input-group-addon" >店主：</span>
                                        <input type="text" class="form-control"  aria-describedby="sizing-addon2" name="shop.ownerName" value="${shop.ownerName}"/>
                                    </div>
                                </div>
                            </div>



                            <div class="row" style="margin-top:10px;">
                                <div class="col-md-10 col-md-offset-1">
                                    <div class="input-group">
                                        <span class="input-group-addon" >店铺联系方式：</span>
                                        <input type="text" class="form-control"  aria-describedby="sizing-addon2" name="shop.tel" value="${shop.tel}"/>
                                    </div>
                                </div>
                            </div>

                            <div class="row"  style="margin-top:10px;" >
                                <div class="col-md-2 col-md-offset-1">
                                    <span class="input-group-addon" >店铺描述：</span>
                                </div>
                            </div>
                            <div class="row" >
                                <div class="col-md-10 col-md-offset-1">
                                    <textarea   rows="8" style="width: 100%;resize:none;border:inset 3px #000000" name="shop.description">${shop.description}</textarea>
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
                        <li><a href="clubHomepage.jsp"><i class="icon fa fa-home"></i>商家信息</a></li>
                    </ol>
                </div>
                <div class="pull-right">
                    <h2 id="tag">商家</h2>
                </div>
            </div>
            <!-- End Page Header -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel">
                        <div class="panel-heading bk-bg-primary" style="height: 48px;">
                            <h6><i class="fa fa-table red"></i><span class="break"></span><s:property value="shop.shopName"/></h6>
                            <div class="panel-actions">
                                <button type="button" class="modify_button" data-toggle="modal" data-target="#change_shop_info">修改基本信息</button>
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
                                        <td>店铺名</td>
                                        <td><s:property value="shop.shopName"/></td>
                                    </tr>
                                    <tr>
                                        <td>店铺地址</td>
                                        <td><s:property value="shop.province"/>-
                                            <s:property value="shop.city"/>-
                                            <s:property value="shop.district"/>-
                                            <s:property value="shop.detail"/></td>
                                    </tr>
                                    <tr>
                                        <td>店主</td>
                                        <td><s:property value="shop.ownerName"/></td>
                                    </tr>
                                    <tr>
                                        <td>店铺等级</td>
                                        <td><s:property value="shop.level"/></td>
                                    </tr>
                                    <tr>
                                        <td>联系方式</td>
                                        <td><s:property value="shop.tel"/></td>
                                    </tr>

                                    <tr>
                                        <td colspan="2">店铺描述</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2"><s:property value="shop.description"/></td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">店铺风采</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" style="text-align: center">

                                                <img src="../" />


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


<script src="../js/jquery-2.1.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>

<script src="../js/club/core.min.js"></script>
</body>

</html>