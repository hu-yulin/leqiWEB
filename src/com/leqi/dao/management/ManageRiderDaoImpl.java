package com.leqi.dao.management;

import com.leqi.bean.RiderEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageRiderDaoImpl implements ManageRiderDao {
    @Override
    public int getRidersCount() {
        Session session= HibernateSessionFactory.getSession();
        String hql="select count(b) from RiderEntity b";
        Query query=session.createQuery(hql);
        Long count= (Long) query.uniqueResult();
        session.close();
        return new Long(count).intValue();
    }

    @Override
    public List<RiderEntity> getAllRiders() {
        Session session=HibernateSessionFactory.getSession();
        String hql="from RiderEntity as s order by s.riderId desc ";
        Query query=session.createQuery(hql);
        List<RiderEntity> list=query.list();
        session.close();
        return list;
    }

    @Override
    public RiderEntity getRiderInfo(int riderID) {
        Session session= HibernateSessionFactory.getSession();
        RiderEntity rider=session.get(RiderEntity.class,riderID);
        session.close();
        return rider;
    }

    @Override
    public void removeRider(int riderID) {

    }

    @Override
    public void addRider(RiderEntity riderEntity) {
        Transaction tr=null;
        Session session= HibernateSessionFactory.getSession();
        tr=session.beginTransaction();
        session.save(riderEntity);
        tr.commit();
        session.close();
    }
}
