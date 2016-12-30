package com.leqi.biz.shop;

import com.leqi.bean.GoodEntity;
import com.leqi.dao.shop.ShopControlGoodDaoImpl;

import java.util.List;

/**
 * Created by lenovo on 2016/12/27.
 */
public class ShopControlOfGoodBizImpl implements ShopControlOfGoodBiz {

    ShopControlGoodDaoImpl shopControl=new ShopControlGoodDaoImpl();
    @Override
    public List<GoodEntity> getShopGoods(int shopID, int currentPage) {
        return shopControl.getShopGoods(shopID, currentPage);
    }

    @Override
    public GoodEntity getGoodDetail(int goodID) {
        return shopControl.getGoodDetail(goodID);
    }

    @Override
    public void removeGood(int goodID,String path) {
        shopControl.removeGood(goodID,path);
    }

    @Override
    public void addGood(GoodEntity good) {
        shopControl.addGood(good);
    }

    @Override
    public int getGoodsCount(int shopID) {
        return shopControl.getGoodsCount(shopID);
    }
}
