package dao;

import bean.ActivityEntity;
import bean.GoodEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Map;

/**
 * Created by lenovo on 2016/12/4.
 */
public class HibernateSessionFactory {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();

        try {
            System.out.println("querying all the managed entities...");
            Transaction tx=session.beginTransaction();
            ActivityEntity activityEntity=(ActivityEntity) session.get(ActivityEntity.class,1);
            System.out.println(activityEntity.getStartPlace());

//            GoodEntity good=new GoodEntity();
//            good.setBrand("zhongguo");
//            good.setCurrentPrice(100);
//            good.setDescription("helo");
//            good.setGoodId(1);
//            good.setHitCount(100);
//            good.setIsRented(1);
//            good.setName("namg");
//            good.setOnSaleTime(0);
//            good.setOriginalPrice(1);
//            good.setShopId(1);
//            good.setTypeId(1);
//            session.save(good);
            tx.commit();
        } finally {
            session.close();
        }
    }
}