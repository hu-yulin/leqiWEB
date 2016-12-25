package dao;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Created by lenovo on 2016/12/4.
 */
public class HibernateSessionFactory {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
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
            Transaction tx=session.beginTransaction();
//            ActivityEntity activityEntity=session.get(ActivityEntity.class,1);
//            Iterator<ActivityPicEntity> iterator=activityEntity.getActivityPicEntities().iterator();
//            while(iterator.hasNext()){
//                System.out.println(iterator.next().getPath());
//            }

            ZjTestEntity zjTestEntity=session.get(ZjTestEntity.class,10);
            System.out.println(zjTestEntity.getName());
            tx.commit();
        } finally {
            session.close();
        }
    }
}