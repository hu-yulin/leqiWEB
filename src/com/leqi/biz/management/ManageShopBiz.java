package com.leqi.biz.management;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/12/28.
 */
public interface ManageShopBiz {
    public int getShopsCount();
    public ShopEntity getShopInfo(int shopID);
    public void addShop(ShopEntity shop, UserEntity user);
    public void removeShop(int shopID);
    public List<ShopEntity> getAllShops();
}
