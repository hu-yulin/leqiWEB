<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/26
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page language="java"  pageEncoding="UTF-8"%>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--顶部-->
<div class="top">
    <div><span style="font-size: 23px;line-height: 45px;padding-left: 20px;color: #fff">  “乐骑”  管理端
	  			<a class="btn btn-default" href="Login.jsp" role="button">退出</a>
	  		</span></div>
</div>
<!--顶部结束-->
<!--菜单-->
<div class="left-menu">
    <ul id="menu">
        <li class="menu-list"> <i  class="glyph-icon xlcd" style="padding-left:0px;padding-right:0px"></i>商家管理<s class="sz"></s>
            <ul>
                <li><a href="/manage/managementAddShop.jsp"><i class="glyph-icon"></i>添加商家</a></li>
                <li><a href="managementAllShops.action"><i class="glyph-icon"></i>全部商家</a></li>

            </ul>
        </li>

        <li class="menu-list"> <i  class="glyph-icon xlcd" style="padding-left:0px;padding-right:0px"></i>俱乐部管理<s class="sz"></s>
            <ul>
                <li><a href="/manage/managementAddClub.jsp"><i class="glyph-icon"></i>添加俱乐部</a></li>
                <li><a href="managementAllClubs.action"><i class="glyph-icon"></i>俱乐部列表</a></li>
            </ul>
        </li>

        <li class="menu-list"> <i  class="glyph-icon xlcd" style="padding-left:0px;padding-right:0px"></i>用户管理<s class="sz"></s>
            <ul>
                <li><a href="#"><i class="glyph-icon"></i>用户列表</a></li>
            </ul>
        </li>

    </ul>
</div>


