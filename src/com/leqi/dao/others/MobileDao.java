package com.leqi.dao.others;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by lenovo on 2017/1/4.
 */
public class MobileDao {
    public List<ClubActivityEntity> getAllActivities(){
        Session session= HibernateSessionFactory.getSession();
        String hql="from ClubActivityEntity as s order by s.activityId desc ";
        Query query=session.createQuery(hql);
        List<ClubActivityEntity> list=query.list();
        session.close();
        return list;
    }
}
