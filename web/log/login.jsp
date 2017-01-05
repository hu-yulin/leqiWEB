<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html class="no-js">

<head>

    <meta charset="utf-8">
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel="stylesheet" href="css/log/reset.css">
    <link rel="stylesheet" href="css/log/supersized.css">
    <link rel="stylesheet" href="css/log/style.css">

    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/log/supersized.3.2.7.min.js"></script>
    <script src="js/log/supersized-init.js"></script>
    <script type="text/javascript">
        window.onload = function () {
            $(".connect p").eq(0).animate({"left": "0%"}, 600);
            $(".connect p").eq(1).animate({"left": "0%"}, 400);
        };
        function submit() {
            $("#remind").replaceWith("<ul id='remind'></ul>");
            $.post("log.action", {userName: $("#u").val(), pass: $("#p").val()},
                    function (data) {
                        if (data == "1") {
                            window.location.href = "managementAllShops.action";
                        }
                        else if (data == "2") {
                            window.location.href = "shopInfo.action";
                        } else if (data == "3") {
                            window.location.href = "clubHomePage.action";
                        } else {
                            $("#remind").append("<li style='text-align:center;color:#F00;font-size: 18px'>用户名或是密码错误</li>");
                            $("#p").val("");
                        }
                    });
        }
    </script>
</head>

<body oncontextmenu="return false">

<div class="page-container">
    <h1>Login--“乐骑”</h1>
    <div>
        <input type="text" id="u" name="username" class="username" placeholder="用户名" autocomplete="off"/>
    </div>
    <div>
        <input type="password" id="p" name="password" class="password" placeholder="密码" oncontextmenu="return false"
               onpaste="return false"/>
    </div>
    <button type="button" onclick="submit()">登 录</button>
    <ul id="remind">
    </ul>

    <div class="connect">
        <p>If we can only encounter each other rather than stay with each other,then I wish we had never
            encountered.</p>
        <p style="margin-top:20px;">如果只是遇见，不能停留，不如不遇见。</p>
    </div>
</div>


</body>

</html>

