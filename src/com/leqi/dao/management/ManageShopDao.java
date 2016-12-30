package com.leqi.dao.management;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public interface ManageShopDao {
    public int getShopsCount();
    public void addShop(ShopEntity shop);
    public void removeShop(int shopID);
    public List getAllShops();
}
