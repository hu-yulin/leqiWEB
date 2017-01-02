package com.leqi.dao.shop;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserPicEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2016/12/27.
 */
public class ShopControlDaoImpl implements ShopControlDao {
    @Override
    public ShopEntity getShopInfo(int shopID) {
        Session session= HibernateSessionFactory.getSession();
        ShopEntity shop=session.get(ShopEntity.class,shopID);
        session.close();
        return shop;
    }

    @Override
    public void changeShopInfo(int shopID, ShopEntity shop) {
        Session session=HibernateSessionFactory.getSession();
        Transaction tx=null;
        ShopEntity old=session.get(ShopEntity.class,shopID);

        old.setCity(shop.getCity());
        old.setDescription(shop.getDescription());
        old.setDetail(shop.getDetail());
        old.setDistrict(shop.getDistrict());
        old.setOwnerName(shop.getOwnerName());
        old.setProvince(shop.getProvince());
        old.setShopName(shop.getShopName());
        old.setTel(shop.getTel());

        tx=session.beginTransaction();
        session.update(old);
        tx.commit();
        HibernateSessionFactory.closeSession();
    }

    @Override
    public void changeHeadPic(int shopID, Set<UserPicEntity> pics) {
        Session session= HibernateSessionFactory.getSession();
        Transaction tx=null;
        ShopEntity old=session.get(ShopEntity.class,shopID);
        old.setPics(pics);
        tx=session.beginTransaction();
        session.update(old);
        tx.commit();
        session.close();
    }


}
