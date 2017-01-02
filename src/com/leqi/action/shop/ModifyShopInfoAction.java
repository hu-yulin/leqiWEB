package com.leqi.action.shop;

import com.leqi.action.GetUserID;
import com.leqi.bean.ShopEntity;
import com.leqi.biz.shop.ShopControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/28.
 */
public class ModifyShopInfoAction extends ActionSupport{
    private ShopEntity shop;

    public String execute(){
        int shopID=new GetUserID().getUserID();
        if(shopID==-1){
            return "login";
        }
        ShopControlBizImpl shopControlDao=new ShopControlBizImpl();

        shopControlDao.changeShopInfo(shopID,shop);
        return SUCCESS;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }
}
