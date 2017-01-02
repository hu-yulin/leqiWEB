package com.leqi.dao.shop;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserPicEntity;

import java.util.List;
import java.util.Set;


/**
 * Created by lenovo on 2016/12/27.
 */
public interface ShopControlDao {
    public ShopEntity getShopInfo(int shopID);
    public void changeShopInfo(int shopID,ShopEntity shop);
    public void changeHeadPic(int shopID,Set<UserPicEntity> pics);
}
