<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/29
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加俱乐部</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/manage/Iframe.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/manage/index1.css" type="text/css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript" ></script>
</head>
<body>
    <%@ include file="left_bar.jsp"%>

    <div id="right-content" class="right-content">
        <div class="content">
            <div id="page_content">
                <div class="container-fluid" >
                    <form action="managementAddClub.action" method="post">

                        <div class="row" style="margin-top:50px;">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="input-group">
                                    <span class="input-group-addon" >俱乐部登录名：</span>
                                    <input type="text" name="user.username" class="form-control"  aria-describedby="sizing-addon2" placeholder="必输入"/>
                                </div>
                            </div>
                        </div>

                        <div class="row" style="margin-top:20px;">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="input-group">
                                    <span class="input-group-addon" >俱乐部初始密码：</span>
                                    <input type="text" name="user.password" class="form-control"  aria-describedby="sizing-addon2" placeholder="必输入"/>
                                </div>
                            </div>
                        </div>

                        <div class="row" style="margin-top:20px;">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="input-group">
                                    <span class="input-group-addon" >俱乐部名：</span>
                                    <input type="text" name="club.title" class="form-control"  aria-describedby="sizing-addon2" placeholder="必输入"/>
                                </div>
                            </div>
                        </div>

                        <div class="row" style="margin-top:20px;">
                            <div class="col-md-10 col-md-offset-1">
                                其他信息由俱乐部自行添加
                            </div>
                        </div>

                        <div class="row" style="margin-top:20px;">
                            <div class="col-md-10 col-md-offset-1">
                                <button type="submit">添加</button>
                            </div>
                        </div>

                    </form>
                </div>

            </div>
        </div>
    </div>
</body>
</html>