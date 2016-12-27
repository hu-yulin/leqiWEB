package com.leqi.biz.shop;

import com.leqi.bean.ShopEntity;

/**
 * Created by lenovo on 2016/12/27.
 */
public interface ShopControl {
    public ShopEntity getShopInfo(int shopID);
    public void changeShopInfo(int shopID,ShopEntity shop);
    public void getShopsCount();
    public void addShop(ShopEntity shopEntity);
}
