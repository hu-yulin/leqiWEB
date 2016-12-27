package com.leqi.dao.shop;

import com.leqi.bean.ShopEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by lenovo on 2016/12/27.
 */
public class ShopControlDaoImpl implements ShopControlDao {
    @Override
    public ShopEntity getShopInfo(int shopID) {
        Session session= HibernateSessionFactory.getSession();
        ShopEntity shop=session.get(ShopEntity.class,shopID);
        return shop;
    }

    @Override
    public void changeShopInfo(int shopID, ShopEntity shop) {

    }

    @Override
    public void getShopsCount() {

    }

    @Override
    public void addShop(ShopEntity shopEntity) {

    }

    @Override
    public List<ShopEntity> getShops(int currentPage) {
        return null;
    }
}
