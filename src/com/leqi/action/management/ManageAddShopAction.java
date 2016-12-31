package com.leqi.action.management;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserEntity;
import com.leqi.biz.management.ManageShopBiz;
import com.leqi.biz.management.ManageShopBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageAddShopAction extends ActionSupport{
    private UserEntity user;//传入
    private ShopEntity shop;//传入


    public String addShop(){
        ManageShopBiz manageShopBiz=new ManageShopBizImpl();
        user.setUserType(2);
        manageShopBiz.addShop(shop,user);
        return SUCCESS;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }
}
