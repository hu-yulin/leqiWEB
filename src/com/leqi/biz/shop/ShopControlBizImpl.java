package com.leqi.biz.shop;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserPicEntity;
import com.leqi.dao.shop.ShopControlDaoImpl;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by lenovo on 2016/12/27.
 */
public class ShopControlBizImpl implements ShopControlBiz {

   private ShopControlDaoImpl shopControlDao=new ShopControlDaoImpl();
    @Override
    public ShopEntity getShopInfo(int shopID) {
        return shopControlDao.getShopInfo(shopID);
    }

    @Override
    public void changeShopInfo(int shopID, ShopEntity shop) {
       shopControlDao.changeShopInfo(shopID,shop);
    }

    @Override
    public void getShopsCount() {

    }

    @Override
    public void addShop(ShopEntity shopEntity) {

    }

    @Override
    public String getHeadPic(int shopID) {
        ShopEntity shopEntity= shopControlDao.getShopInfo(shopID);
        Set<UserPicEntity> pics=shopEntity.getPics();
        if(pics.size()==0||pics==null){
            return "";
        }
        Iterator<UserPicEntity> iterator=pics.iterator();
        while(iterator.hasNext()){
            UserPicEntity pic=iterator.next();
            return pic.getPath();
        }
        return "";
    }

    @Override
    public void changeHeadPic(int shopID, Set<UserPicEntity> pics) {
        shopControlDao.changeHeadPic(shopID, pics);
    }
}
