package com.leqi.action.shop;

import com.leqi.bean.GoodEntity;
import com.leqi.biz.shop.ShopControlOfGoodBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author huyulin
 * Created by lenovo on 2016/12/28.
 */
public class GetGoodDetailAction extends ActionSupport {
    private int goodID;//传入

    private GoodEntity good;//goodDetail.jsp使用

    public String execute(){
        //需要先判断有无goodID
        if(goodID==0){
            return "error";
        }
        ShopControlOfGoodBizImpl goodControl=new ShopControlOfGoodBizImpl();
        good=goodControl.getGoodDetail(goodID);
        return SUCCESS;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public GoodEntity getGood() {
        return good;
    }

    public void setGood(GoodEntity good) {
        this.good = good;
    }
}
