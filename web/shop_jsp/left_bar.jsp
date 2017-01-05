<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="changeHeadPic">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">修改头像</h4>
            </div>

            <form action="changeShopHeadPic.action" method="post" enctype="MULTIPART/FORM-DATA">
                <div class="modal-body">
                    <div class="container-fluid">
                        <div class="row" style="margin-top:20px;">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="panel panel-default " >
                                    <div class="panel-heading ">选择图片(仅第一张图片将会被上传)</div>
                                    <div class="panel-body text-center">

                                        <div class="file_item">
                                            <input type="file">
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer ">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="submit" class="btn btn-primary" >上传</button>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<div class="sidebar">
    <div >
        <div >
            <nav id="menu" class="nav-main" role="navigation">
                <ul class="nav nav-sidebar">
                    <!--User-->
                    <div class="panel-body text-center">
                        <div class="bk-avatar">
                            <img src="${pageContext.request.contextPath}/${headPic}" class="img-circle bk-img-60" data-toggle="modal" data-target="#changeHeadPic"/>
                        </div>
                        <div class="bk-padding-top-10">
                            <i class="fa fa-circle text-success"></i>
                            <small>Administrator</small>
                        </div>
                        <div style="float: right;font-size: 14px">
                            <a href="${pageContext.request.contextPath}/">注销</a>
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
                        <a href="addGoodPage.action">
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
            <h5 style="margin-top: 20px">组员：张靖 闫新跃<br></h5>
            <h5>组员： 李丹 王肇鑫<br></h5>
            <h5 style="padding-left: 60px"></h5>
            <h5 style="bottom: 0;margin-top: 20px">指导老师：刘益先</h5>
        </div>
    </div>
    <!--End Footer-->
</div>