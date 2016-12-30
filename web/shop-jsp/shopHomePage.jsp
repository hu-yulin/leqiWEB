<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/18
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>商家首页</title>

    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/shop_home.css" type="text/css" rel="stylesheet">
    <link href="../css/style.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/head.css" type="text/css" rel="stylesheet">
    <script src="../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.min.js" type="text/javascript" ></script>
    <style>
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
    </style>
    <script>
        $('.carousel').carousel({
            interval: 1000
        })

    </script>

</head>
<body style="background-color: #f6f6f6;">

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

<!--最顶部的bar-->
<div  style="height: 40px;line-height:40px;width: 100%;background-color: #e3e4e5;text-align: right">
    乐骑，商家专用   欢迎：<s:property value="data"/> <button type="button" class="modify_button" style="margin-right: 20px">退出</button>
</div>


<div class="container-fluid" style="height: 480px;margin-top: 100px">
    <div class="row">

        <div class="col-md-2 col-md-offset-1" style="height: 100%;background-color: #6e6568;color: #ffffff">
            <ul style="padding-top: 15px">
                <a href="#" class="hvr-sweep-to-left button left_choose_a" > <li class="left_choose_li " >商家首页</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">全部商品</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">添加商品</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">下架商品</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">发布活动</li></a>
            </ul>
        </div>

        <div class="col-md-7" style="height: 100%" >
            <div class="head">
                <div class="container-fluid">
                    <div class="row" >
                        <div class="col-md-12" style="padding-left: 0px;padding-right: 0px;">
                            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="z-index: 1;">
                                <div class="carousel-inner" role="listbox">
                                    <div class="item active">
                                        <img src="../pic/roll1.jpg" alt="...">
                                    </div>
                                    <div class="item">
                                        <img src="../pic/roll2.jpg" alt="...">
                                    </div>
                                    <div class="item">
                                        <img src="../pic/roll3.jpg" alt="...">
                                    </div>





                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


    </div>
</div>

<!-- 接下来店铺信息-->
<div class="container-fluid">
    <div class="row">
        <div class="col-md-10 col-md-offset-1 shop_info_bar" style="background-image: url(../pic/pageNeed/bar.png);">
            店铺基本信息 <button type="button" class="modify_button" data-toggle="modal" data-target="#change_shop_info">修改信息</button>
        </div>
    </div>

    <div class="row" >
        <div class="col-md-offset-1 col-md-10 shop_info" >
            <table >
                <tr>
                    <th>店铺名</th>
                    <th class="shop_info_detial"><s:property value="shop.shopName"/></th>
                </tr>
                <tr>
                    <th>店铺地址</th>
                    <th class="shop_info_detial">
                        <s:property value="shop.province"/>-
                        <s:property value="shop.city"/>-
                        <s:property value="shop.district"/>-
                        <s:property value="shop.detail"/>
                    </th>
                </tr>
                <tr>
                    <th>店主</th>
                    <th class="shop_info_detial"><s:property value="shop.ownerName"/></th>
                </tr>
                <tr>
                    <th>店铺描述</th>
                    <th class="shop_info_detial"><s:property value="shop.description"/></th>
                </tr>
                <tr>
                    <th>联系方式</th>
                    <th class="shop_info_detial"><s:property value="shop.tel"/></th>
                </tr>
                <tr>
                    <th>店铺等级</th>
                    <th class="shop_info_detial"><s:property value="shop.level"/></th>
                </tr>
                <tr>
                    <th>店铺关注人数</th>
                    <th class="shop_info_detial"><s:property value="shop.collectedCount"/></th>
                </tr>
            </table>

        </div>
    </div>
</div>


</body>
</html>