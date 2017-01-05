package com.leqi.dao.others;

import com.leqi.bean.UserEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by lenovo on 2017/1/5.
 */
public class ChangePassDaoImpl {
    public void changePass(int userID,String pass){
        Session session= HibernateSessionFactory.getSession();
        Transaction tx=null;
        UserEntity old=session.get(UserEntity.class,userID);
        old.setPassword(pass);
        tx=session.beginTransaction();
        session.update(old);
        tx.commit();
        session.close();
    }
}
