package com.leqi.biz.shop;

import com.leqi.bean.ShopEntity;
import com.leqi.dao.shop.ShopControlDaoImpl;

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
}
