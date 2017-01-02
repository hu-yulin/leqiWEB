package com.leqi.dao.others;

import com.leqi.bean.UserEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;

import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by lenovo on 2017/1/2.
 */
public class LogDaoImpl implements LogDao{
    @Override
    public int login(String userName, String pass) {

        Session session= HibernateSessionFactory.getSession();
        String hql="from UserEntity  b where b.username=:username and b.password=:password";
        Query query=session.createQuery(hql);
        query.setParameter("username",userName);
        query.setParameter("password",pass);
        List list=query.list();
        session.close();

        if(list.size()==0){
            return -1;
        }else{
            UserEntity userEntity= (UserEntity) list.get(0);
            return userEntity.getUserType();
        }
    }

    @Override
    public int getUserID(String userName, String pass) {
        Session session= HibernateSessionFactory.getSession();
        String hql="from UserEntity  b where b.username=:username and b.password=:password";
        Query query=session.createQuery(hql);
        query.setParameter("username",userName);
        query.setParameter("password",pass);
        List list=query.list();
        session.close();

        if(list.size()==0){
            return -1;
        }else{
            UserEntity userEntity= (UserEntity) list.get(0);
            return userEntity.getUserId();
        }
    }
}
