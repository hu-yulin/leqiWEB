package com.leqi.dao.shop;

import com.leqi.bean.ShopEntity;

import java.util.List;


/**
 * Created by lenovo on 2016/12/27.
 */
public interface ShopControlDao {
    public ShopEntity getShopInfo(int shopID);
    public void changeShopInfo(int shopID,ShopEntity shop);
}
