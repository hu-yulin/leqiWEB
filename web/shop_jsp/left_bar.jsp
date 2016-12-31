<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="sidebar">
    <div >
        <div >
            <nav id="menu" class="nav-main" role="navigation">
                <ul class="nav nav-sidebar">
                    <!--User-->
                    <div class="panel-body text-center">
                        <div class="bk-avatar">
                            <img src="images/avatar.jpg" class="img-circle bk-img-60" alt=""/>
                        </div>
                        <div class="bk-padding-top-10">
                            <i class="fa fa-circle text-success"></i>
                            <small>Administrator</small>
                        </div>
                        <div style="float: right;font-size: 14px">
                            <a href="">注销</a>
                        </div>
                    </div>
                    <!--End User-->

                    <!--Function-->
                    <li class="active">
                        <a href="shopInfo.action">
                            <i class="icon fa fa-home"></i><span>商家</span>
                        </a>
                    </li>
                    <li>
                        <a href="shopGoods.action">
                            <i class="fa fa-bicycle" aria-hidden="true"></i><span>全部商品</span>
                        </a>
                    </li>
                    <li>
                        <a href="/shop_jsp/addGood.jsp">
                            <i class="fa fa-plus-square" aria-hidden="true"></i>
                            <span>添加商品</span>
                        </a>
                    </li>
                    <!--End Function-->
                </ul>
            </nav>
        </div>

    </div>
    <!--Footer-->
    <div class="sidebar-footer">
        <div style="position: relative;width: 100%">
            <h3>Java框架与组件实验</h3>
        </div>
        <div style="width:100%;float: right">
            <h5>组长：胡玉林<br></h5>
            <h5>组员：张靖 闫新跃<br></h5>
            <h5>组员：李丹 王肇鑫<br></h5>
            <h5 style="padding-left: 60px"></h5>
            <h5 style="bottom: 0;margin-top: 20px">指导老师：刘益先</h5>
        </div>
    </div>
    <!--End Footer-->
</div>