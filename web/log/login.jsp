<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html class="no-js">

    <head>

        <meta charset="utf-8">
        <title>Fullscreen Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="../css/log/reset.css">
        <link rel="stylesheet" href="../css/log/supersized.css">
        <link rel="stylesheet" href="../css/log/style.css">

		<script src="../js/jquery-2.1.1.min.js" type="text/javascript"></script>
		<script src="../js/log/supersized.3.2.7.min.js"></script>
		<script src="../js/log/supersized-init.js"></script>
       	<script type="text/javascript">
			window.onload = function()
			{
				$(".connect p").eq(0).animate({"left":"0%"}, 600);
				$(".connect p").eq(1).animate({"left":"0%"}, 400);
			};

			function submit(){
				$("ul").replaceWith("<ul></ul>");
				$.post("log",{username:$("#u").val() , password:$("#p").val() },
						function(data){
							if(data=="true"){
								if(label == 1){
									window.location.href="homepage.jsp";
								}
								if(label==2){
									window.location.href="Backstage_ClassInfor.jsp";
								}
							}
							else {
								$("ul").append("<li style='text-align:center;color:#F00;font-size: 18px'>用户名或密码错误，请重新输入！</li>");

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
					<input type="password" id="p" name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
                </div>
                <button type="button" onclick="submit()">登陆</button>
				<ul>
				</ul>

            <div class="connect">
                <p>If we can only encounter each other rather than stay with each other,then I wish we had never encountered.</p>
				<p style="margin-top:20px;">如果只是遇见，不能停留，不如不遇见。</p>
            </div>
        </div>


    </body>

</html>

