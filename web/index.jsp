<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/12/17
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$struct hello

  <form name="test" action="hello.action">
       <textarea name="data">

       </textarea>
    <button type="submit" value="提交"></button>
  </form>
  <a href="hello.action">home</a>
  <a href="addGoodPage.action">添加</a>
  <a href="goodDetail.action?goodID=6">goodDetail</a>
  <a href="shopGoods.action?shopID=2&currentPage=1">all</a>
  <a href="shopInfo.action?shopID=2">店铺首页</a>
  <a href="managementAllShops.action">管理所有商家</a>
  <a href="addShopPage.action">添加商家界面</a>
  <a href="managementAddClubPage.action">添加俱乐部</a>
  <a href="clubHomePage.action?clubID=5">俱乐部首页</a>
  </body>
</html>
