package com.leqi.action.management;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserEntity;
import com.leqi.biz.management.ManageShopBiz;
import com.leqi.biz.management.ManageShopBizImpl;
import com.leqi.biz.shop.ShopControlOfGoodBiz;
import com.leqi.biz.shop.ShopControlOfGoodBizImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * 包括检查全部商家  商家详情
 * @author huyulin
 * Created by lenovo on 2016/12/29.
 */
public class ManageCheckShopAction extends ActionSupport {
    private int shopID;//传入

    private int shopsCount;//jsp use
    private List<ShopEntity> shops;//jsp use
    private ShopEntity shopInfo;//jsp use
    private int goodsCount;//jsp use

    private  ManageShopBiz manageShopBiz=new ManageShopBizImpl();

    public String getAllShops(){
        shops=manageShopBiz.getAllShops();
        shopsCount=shops.size();
        return SUCCESS;
    }

    public String checkShopInfo(){
        ShopControlOfGoodBiz shopControlOfGoodBiz=new ShopControlOfGoodBizImpl();
        shopInfo=manageShopBiz.getShopInfo(shopID);
        goodsCount=shopControlOfGoodBiz.getGoodsCount(shopID);
        return SUCCESS;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public ShopEntity getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(ShopEntity shopInfo) {
        this.shopInfo = shopInfo;
    }



    public int getShopsCount() {
        return shopsCount;
    }

    public void setShopsCount(int shopsCount) {
        this.shopsCount = shopsCount;
    }

    public List<ShopEntity> getShops() {
        return shops;
    }

    public void setShops(List<ShopEntity> shops) {
        this.shops = shops;
    }


}
