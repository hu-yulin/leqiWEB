package test.bean;

import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class SessionFactoryTest {
    HibernateSessionFactory hibernateSessionFactory= (HibernateSessionFactory) HibernateSessionFactory.getSessionFactory();
    @Test
    public void sessionFactory(){

    }
}
