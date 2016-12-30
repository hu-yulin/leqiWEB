package com.leqi.action.shop;

import com.leqi.bean.ShopEntity;
import com.leqi.biz.shop.ShopControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/28.
 */
public class ModifyShopInfoAction extends ActionSupport{
    private ShopEntity shop;

    public String execute(){
        //首先必须判断shopID是否存在
        ShopControlBizImpl shopControlDao=new ShopControlBizImpl();
        int shopID=2;
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
