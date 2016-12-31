<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <!-- Basic -->
    <meta charset="UTF-8"/>

    <title>商家</title>

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
                        <li class="active"><i class="fa fa-plus-square" aria-hidden="true"></i>
                            添加商品</li>
                    </ol>
                </div>

            </div>
            <!-- End Page Header -->
            <div class="row">
                <div class="col-md-12" style="margin-top: 20px">
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
        <!-- End Main Page -->
    </div>
</div>

</body>

</html>