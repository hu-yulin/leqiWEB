package com.leqi.dao.club;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.ClubEntity;
import com.leqi.bean.RiderEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public class ClubControlDaoImpl implements ClubControlDao {
    @Override
    public void changeClubInfo(int clubID, ClubEntity club) {
        Session session= HibernateSessionFactory.getSession();
        Transaction tx=null;
        ClubEntity old=session.get(ClubEntity.class,clubID);
        old.setTitle(club.getTitle());
        old.setDescription(club.getDescription());
        old.setOwner(club.getOwner());
        old.setContact(club.getContact());
        old.setProvince(club.getProvince());
        old.setCity(club.getCity());
        old.setDistrict(club.getDistrict());
        old.setDetail(club.getDetail());
        tx=session.beginTransaction();
        session.update(old);
        tx.commit();
        session.close();
    }

    @Override
    public List<ClubActivityEntity> getClubActivities(int clubID) {
        //每页放置4个活动

        Session session=HibernateSessionFactory.getSession();
        String hql="from ClubActivityEntity  b where b.clubId=:clubid order by b.activityId desc ";
        Query query=session.createQuery(hql);
        query.setParameter("clubid",clubID);

        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public void addActivity(ClubActivityEntity activity) {
        Transaction tr=null;
        Session session= HibernateSessionFactory.getSession();
        tr=session.beginTransaction();
        session.save(activity);
        tr.commit();
        session.close();
    }

    @Override
    public void removeActivity(int activityID) {

    }

}
