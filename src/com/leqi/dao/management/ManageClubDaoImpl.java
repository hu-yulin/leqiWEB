package com.leqi.dao.management;

import com.leqi.bean.ClubEntity;
import com.leqi.bean.ShopEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageClubDaoImpl implements ManageClubDao {
    @Override
    public int getClubsCount() {
        Session session= HibernateSessionFactory.getSession();
        String hql="select count(b) from ClubEntity b";
        Query query=session.createQuery(hql);
        Long count= (Long) query.uniqueResult();
        session.close();
        return new Long(count).intValue();
    }

    @Override
    public List<ClubEntity> getALLClubs() {
        Session session=HibernateSessionFactory.getSession();
        String hql="from ClubEntity as s order by s.clubId desc ";
        Query query=session.createQuery(hql);
        List<ClubEntity> list=query.list();
        return list;
    }

    @Override
    public ClubEntity getClubInfo(int clubID) {
        Session session= HibernateSessionFactory.getSession();
        ClubEntity club=session.get(ClubEntity.class,clubID);
        session.close();
        return club;
    }

    @Override
    public void addClub(ClubEntity clubEntity) {
        Transaction tr=null;
        Session session= HibernateSessionFactory.getSession();
        tr=session.beginTransaction();
        session.save(clubEntity);
        tr.commit();
        session.close();
    }

    @Override
    public void removeClub(int clubID) {

    }

    @Override
    public int getActivityCount(int clubID) {
        Session session= HibernateSessionFactory.getSession();
        String hql="select count(b) from ClubActivityEntity b where b.clubId=:clubID";
        Query query=session.createQuery(hql);
        query.setParameter("clubID",clubID);
        Long count= (Long) query.uniqueResult();
        session.close();
        return new Long(count).intValue();
    }
}
