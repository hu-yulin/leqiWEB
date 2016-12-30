package com.leqi.action.shop;

import com.leqi.biz.shop.ShopControlOfGoodBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

/**
 * @author huyulin
 * Created by lenovo on 2016/12/28.
 */
public class RemoveGoodAction extends ActionSupport {
    private int goodID;

    public String execute(){
        String path=ServletActionContext.getServletContext().getRealPath("/");
        ShopControlOfGoodBizImpl shopControlOfGoodBiz=new ShopControlOfGoodBizImpl();
        shopControlOfGoodBiz.removeGood(goodID,path);
        return SUCCESS;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }
}
