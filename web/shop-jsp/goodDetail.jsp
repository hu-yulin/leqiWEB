<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/25
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品详情</title>
    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/shop_home.css" type="text/css" rel="stylesheet">
    <link href="../css/style.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/good_detial.css" type="text/css" rel="stylesheet">
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
<div  style="height: 40px;line-height:40px;width: 100%;background-color: #e3e4e5;text-align: right">
    乐骑，商家专用   欢迎：。。。 <button type="button" class="modify_button" style="margin-right: 20px">退出</button>
</div>

<div class="container-fluid" style="min-height: 480px;margin-top: 100px">
    <div class="row">

        <div class="col-md-2 col-md-offset-1" style="height: 480px;background-color: #6e6568;color: #ffffff">
            <ul style="padding-top: 15px">
                <a href="#" class="hvr-sweep-to-left button left_choose_a" > <li class="left_choose_li " >商家首页</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">全部商品</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">添加商品</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">下架商品</li></a>
                <a href="#" class="hvr-sweep-to-left button left_choose_a" ><li class="left_choose_li">发布活动</li></a>
            </ul>
        </div>

        <!--下面进行商品详情展示-->
        <div class="col-md-9  shop_info_bar" style="background-image: url(../pic/pageNeed/bar.png);margin-top:0px">
            商品详情 &nbsp;&nbsp;&nbsp;<button type="button" class="modify_button" data-toggle="modal" data-target="#change_shop_info">下架</button>
        </div>
        <div class="col-md-9" >

            <div class="container-fluid">
                <!--商品图片-->
                <div class="row">
                    <div class="col-md-3" style="height: 220px;margin-top:10px;">
                        <div style="height: 100%;width: 100%;background-color: white">
                            <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                        </div>
                    </div>

                    <div class="col-md-3" style="height: 220px;margin-top:10px;">
                        <div style="height: 100%;width: 100%;background-color: white">
                            <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                        </div>
                    </div>

                    <div class="col-md-3" style="height: 220px;margin-top:10px;">
                        <div style="height: 100%;width: 100%;background-color: white">
                            <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                        </div>
                    </div>

                    <div class="col-md-3" style="height: 220px;margin-top:10px;">
                        <div style="height: 100%;width: 100%;background-color: white">
                            <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                        </div>
                    </div>


                </div>
                <!--商品信息-->
                <div class="row" style="margin-top: 20px">
                    <div class=" col-md-12 shop_info" >
                        <table >
                            <tr>
                                <th>商品名</th>
                                <th class="shop_info_detial">good_name</th>
                            </tr>
                            <tr>
                                <th>品牌</th>
                                <th class="shop_info_detial">good_brand</th>
                            </tr>
                            <tr>
                                <th>是否可租</th>
                                <th class="shop_info_detial">is_rent</th>
                            </tr>
                            <tr>
                                <th>售价</th>
                                <th class="shop_info_detial">sale_prise</th>
                            </tr>
                            <tr>
                                <th>原价</th>
                                <th class="shop_info_detial">original_prise</th>
                            </tr>
                            <tr>
                                <th>商品参数</th>
                                <th class="shop_info_detial"></th>
                            </tr>
                            <tr>
                                <th>商品描述</th>
                                <th class="shop_info_detial">description</th>
                            </tr>
                        </table>

                    </div>
                </div>
            </div>
        </div>




    </div>
</div>



</body>
</html>
