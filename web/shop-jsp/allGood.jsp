<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/25
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>全部商品</title>
    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/shop_home.css" type="text/css" rel="stylesheet">
    <link href="../css/style.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/allGood.css" type="text/css" rel="stylesheet">
    <script src="../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.min.js" type="text/javascript" ></script>

    <style>
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
    </style>
</head>
<body  style="background-color: #f6f6f6;">
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

        <div class="col-md-9  shop_info_bar" style="background-image: url(../pic/pageNeed/bar.png);margin-top:0px">
            全部商品 &nbsp;&nbsp;&nbsp;<button type="button" class="modify_button" data-toggle="modal" data-target="#change_shop_info">新增</button>
        </div>

        <div class="col-md-8" style="margin-top: 20px">
            <div class="container-fluid" href="#">
                <div class="row">
                    <!--下面开始放商品-->
                    <div class="col-md-3 good_item">
                        <div style="width: 100%;background-color: white;height: 100%">
                            <div style="width: 100%;height: 200px; ">
                                <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                            </div>
                            <hr>
                            <span class="good_sale">¥ 665</span><br>
                            <span class="good_name"> 商品名:顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶</span>
                            <a href="#"><div  style="width: 100%;text-align: right;">下架</div></a>
                        </div>
                    </div>


                    <div class="col-md-3 good_item">
                        <div style="width: 100%;background-color: white;height: 100%">
                            <div style="width: 100%;height: 200px; ">
                                <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                            </div>
                            <hr>
                            <span class="good_sale">¥ 665</span><br>
                            <span class="good_name"> 商品名:顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶</span>
                            <a href="#"><div  style="width: 100%;text-align: right;">下架</div></a>
                        </div>
                    </div>


                    <div class="col-md-3 good_item">
                        <div style="width: 100%;background-color: white;height: 100%">
                            <div style="width: 100%;height: 200px; ">
                                <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                            </div>
                            <hr>
                            <span class="good_sale">¥ 665</span><br>
                            <span class="good_name"> 商品名:顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶</span>
                            <a href="#"><div  style="width: 100%;text-align: right;">下架</div></a>
                        </div>
                    </div>


                    <div class="col-md-3 good_item">
                        <div style="width: 100%;background-color: white;height: 100%">
                            <div style="width: 100%;height: 200px; ">
                                <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                            </div>
                            <hr>
                            <span class="good_sale">¥ 665</span><br>
                            <span class="good_name"> 商品名:顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶</span>
                            <a href="#"><div  style="width: 100%;text-align: right;">下架</div></a>
                        </div>
                    </div>


                    <div class="col-md-3 good_item">
                        <div style="width: 100%;background-color: white;height: 100%">
                            <div style="width: 100%;height: 200px; ">
                                <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                            </div>
                            <hr>
                            <span class="good_sale">¥ 665</span><br>
                            <span class="good_name"> 商品名:顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶</span>
                            <a href="#"><div  style="width: 100%;text-align: right;">下架</div></a>
                        </div>
                    </div>

                    <div class="col-md-3 good_item">
                        <div style="width: 100%;background-color: white;height: 100%">
                            <div style="width: 100%;height: 200px; ">
                                <img src="../pic/good/good1.jpg" style="height: 100%;width: 100%;">
                            </div>
                            <hr>
                            <span class="good_sale">¥ 665</span><br>
                            <span class="good_name"> 商品名:顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶</span>
                            <a href="#"><div  style="width: 100%;text-align: right;">下架</div></a>
                        </div>
                    </div>







                </div>
            </div>
        </div>

    </div>
</div>



</body>
</html>
