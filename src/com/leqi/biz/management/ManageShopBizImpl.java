package com.leqi.biz.management;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserEntity;
import com.leqi.dao.management.ManageDao;
import com.leqi.dao.management.ManageDaoImpl;
import com.leqi.dao.management.ManageShopDao;
import com.leqi.dao.management.ManageShopDaoImpl;
import com.leqi.dao.shop.ShopControlDao;
import com.leqi.dao.shop.ShopControlDaoImpl;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageShopBizImpl implements ManageShopBiz{
    private ManageDao manageDao=new ManageDaoImpl();
    private ManageShopDao manageShopDao=new ManageShopDaoImpl();

    @Override
    public int getShopsCount() {
        return manageShopDao.getShopsCount();
    }

    @Override
    public ShopEntity getShopInfo(int shopID) {
        ShopControlDao shopControlDao=new ShopControlDaoImpl();
        return shopControlDao.getShopInfo(shopID);
    }

    /**
     * 添加商家  首先添加user 获得userID 在设置shopID 再添加shop
     * @param shop
     * @param user
     */
    @Override
    public void addShop(ShopEntity shop, UserEntity user) {
        int shopID=manageDao.addUser(user);
        shop.setShopId(shopID);
        manageShopDao.addShop(shop);
    }


    @Override
    public void removeShop(int shopID) {

    }

    @Override
    public List<ShopEntity> getAllShops() {
        return manageShopDao.getAllShops();
    }
}
