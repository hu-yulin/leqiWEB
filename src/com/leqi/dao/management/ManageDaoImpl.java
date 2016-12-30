package com.leqi.dao.management;

import com.leqi.bean.UserEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageDaoImpl implements ManageDao {
    @Override
    public int addUser(UserEntity userEntity) {

        Transaction tr=null;
        Session session= HibernateSessionFactory.getSession();
        tr=session.beginTransaction();
        session.save(userEntity);
        tr.commit();
        session.close();

        session= HibernateSessionFactory.getSession();
        String hql="from UserEntity u where u.username=:userName";
        Query query=session.createQuery(hql);
        query.setParameter("userName",userEntity.getUsername());
        List list=query.list();
        Iterator iterator=list.iterator();
        if(iterator.hasNext()){
            userEntity= (UserEntity) iterator.next();
        }
       session.close();
        return userEntity.getUserId();
    }
}
