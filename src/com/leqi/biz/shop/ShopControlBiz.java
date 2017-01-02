package com.leqi.biz.shop;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserPicEntity;

import java.util.Set;

/**
 * Created by lenovo on 2016/12/27.
 */
public interface ShopControlBiz {
    public ShopEntity getShopInfo(int shopID);
    public void changeShopInfo(int shopID,ShopEntity shop);
    public void getShopsCount();
    public void addShop(ShopEntity shopEntity);
    public String getHeadPic(int shopID);
    public void changeHeadPic(int shopID, Set<UserPicEntity> pics);
}
