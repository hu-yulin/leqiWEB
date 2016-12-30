package com.leqi.dao.management;

import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


/**
 * @author huyulin
 * Created by lenovo on 2016/12/29.
 */
public class ManageShopDaoImpl implements ManageShopDao {
    @Override
    public int getShopsCount() {
        Session session= HibernateSessionFactory.getSession();
        String hql="select count(b) from ShopEntity b";
        Query query=session.createQuery(hql);
        Long count= (Long) query.uniqueResult();
        session.close();
        return new Long(count).intValue();
    }


    @Override
    public void addShop(ShopEntity shop) {
        Transaction tr=null;
        Session session= HibernateSessionFactory.getSession();
        tr=session.beginTransaction();
        session.save(shop);
        tr.commit();
        session.close();
    }

    @Override
    public void removeShop(int shopID) {

    }

    @Override
    public List getAllShops() {
        Session session=HibernateSessionFactory.getSession();
        String hql="from ShopEntity as s order by s.shopId desc ";
        Query query=session.createQuery(hql);
        List<ShopEntity> list=query.list();
        session.close();
        return list;
    }
}
