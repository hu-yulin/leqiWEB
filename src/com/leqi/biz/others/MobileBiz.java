package com.leqi.biz.others;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.GoodEntity;
import com.leqi.dao.others.MobileDao;
import com.leqi.dao.shop.ShopControlGoodDaoImpl;

import java.util.List;

/**
 * Created by lenovo on 2017/1/4.
 */
public class MobileBiz {
    private MobileDao mobileDao=new MobileDao();
    public List<ClubActivityEntity> getAllActivities(){
        return mobileDao.getAllActivities();
    }

    public List<GoodEntity> getShopGoods(int shopID){
        return new ShopControlGoodDaoImpl().getShopAllGoods(shopID);
    }
}
