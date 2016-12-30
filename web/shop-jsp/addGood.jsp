<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/25
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>新增商品</title>
    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/shop_home.css" type="text/css" rel="stylesheet">
    <link href="../css/style.css" type="text/css" rel="stylesheet">
    <link href="../css/shop/choose_pic_style.css" type="text/css" rel="stylesheet">
    <script src="../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.min.js" type="text/javascript" ></script>
    <script src="../js/shop/picjs.js" type="text/javascript" ></script>
    <style>
        *{
            padding: 0;
            margin: 0;
            border: 0;
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

        <div class="col-md-9  shop_info_bar" style="background-image: url(../pic/pageNeed/bar.png);margin-top:0px">
            新增商品
        </div>

        <div class="col-md-8" style="margin-top: 20px">
            <div class="container-fluid" >
                <form action="addGood.action" method="post" enctype="MULTIPART/FORM-DATA">

                    <div class="row" style="margin-top:10px;">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="input-group">
                                <span class="input-group-addon" >商品名：</span>
                                <input name="good.name" type="text" class="form-control"  aria-describedby="sizing-addon2"/>
                            </div>
                        </div>
                    </div>

                    <div class="row" style="margin-top:20px;">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="input-group">
                                <span class="input-group-addon" >商品品牌：</span>
                                <input name="good.brand" type="text" class="form-control"  aria-describedby="sizing-addon2"/>
                            </div>
                        </div>
                    </div>

                    <div class="row" style="margin-top:20px;">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="input-group">
                                <span class="input-group-addon"  >是否可租：</span>
                                <input name="good.isRented" value="1" type="radio" checked="checked" style="margin-left: 20px">可租
                                <input name="good.isRented" value="0" type="radio" >不可租
                            </div>
                        </div>
                    </div>

                    <div class="row" style="margin-top:20px;">
                        <div class="col-md-4 col-md-offset-1">
                            <div class="input-group">
                                <span class="input-group-addon" >售价：</span>
                                <input name="good.currentPrice" type="text" class="form-control"  aria-describedby="sizing-addon2"/>
                            </div>
                        </div>
                    </div>

                    <div class="row" style="margin-top:20px;">
                        <div class="col-md-4 col-md-offset-1">
                            <div class="input-group">
                                <span class="input-group-addon" >原价：</span>
                                <input name="good.originalPrice" type="text" class="form-control"  aria-describedby="sizing-addon2"/>
                            </div>
                        </div>
                    </div>

                    <div class="row" style="margin-top:20px;">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="input-group">
                                <span class="input-group-addon" >商品参数：</span>
                                <input name="goodParameter" type="text" class="form-control"  aria-describedby="sizing-addon2"/>
                            </div>
                        </div>
                    </div>
                    <div class="row" >
                        <div class="col-md-10 col-md-offset-1">
                           不同参数之间以空格分割即可
                        </div>
                    </div>

                    <div class="row" style="margin-top:20px;">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="panel panel-default " >
                                <div class="panel-heading ">上传图片</div>
                                <div class="panel-body text-center">

                                        <div class="file_item">
                                            <input type="file">
                                        </div>

                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row"  style="margin-top:20px;" >
                        <div class="col-md-2 col-md-offset-1">
                            <span class="input-group-addon" >商品描述：</span>
                        </div>
                    </div>
                    <div class="row" >
                        <div class="col-md-10 col-md-offset-1">
                            <textarea name="good.description"  rows="8" style="width: 100%;resize:none;border:inset 3px #000000" ></textarea>
                        </div>
                    </div>

                    <div class="row"  style="margin-top:20px;" >
                        <div class="col-md-2 col-md-offset-1">
                           <button type="submit">提交</button>
                        </div>
                    </div>
                </form>
            </div>

        </div>

    </div>
</div>

</body>
</html>
