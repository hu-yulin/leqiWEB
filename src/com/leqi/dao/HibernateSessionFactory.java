package com.leqi.dao;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


/**
 * Created by lenovo on 2016/12/4.
 */
public class HibernateSessionFactory {
    private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
    private static final ThreadLocal<Session> sessionThreadLocal = new ThreadLocal<Session>();
    private static final ThreadLocal<Transaction> transactionThreadLocal = new ThreadLocal<Transaction>();
    private static Configuration configuration = new Configuration();
    private static SessionFactory sessionFactory;
    private static String configFile = CONFIG_FILE_LOCATION;

    static{
        try{
            //      Configuration configuration = new Configuration();
            //      configuration.configure();
            //      ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
            //      ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
            //      sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            configuration.configure(configFile);
            sessionFactory = configuration.buildSessionFactory();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    private HibernateSessionFactory(){

    }

    public static SessionFactory getSessionFactory(){
        //      // Instead of a static variable, use JNDI:
        //      SessionFactory sessionFactory = null;
        //      try{
        //          Context context = new InitialContext();
        //          String jndiName = "java:hibernate/HibernateFactory";
        //          sessionFactory = (SessionFactory) context.lookup(jndiName);
        //      }catch (NamingException ex){
        //          throw new InfrastructureException(ex);
        //      }
        //      return sessionFactory;

        return sessionFactory;
    }

    public static void rebuildSessionFactory(){
        synchronized (sessionFactory){
            try{
                configuration.configure(configFile);
                sessionFactory = configuration.buildSessionFactory();
            }catch (HibernateException e){
                e.printStackTrace();
            }
        }
    }

    public static Session getSession(){
        Session session = (Session) sessionThreadLocal.get();
        try{
            if (session == null || !session.isOpen()){
                if (sessionFactory == null){
                    rebuildSessionFactory();
                }
                session = (sessionFactory != null) ? sessionFactory.openSession() : null;
                sessionThreadLocal.set(session);
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
        return session;
    }

    public static void closeSession(){
        Session session = (Session) sessionThreadLocal.get();
        sessionThreadLocal.set(null);
        try{
            if (session != null && session.isOpen()){
                session.close();
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    public static void beginTransaction(){
        Transaction transaction = (Transaction) transactionThreadLocal.get();
        try{
            if (transaction == null){
                transaction = getSession().beginTransaction();
                transactionThreadLocal.set(transaction);
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    public static void commitTransaction(){
        Transaction transaction = (Transaction) transactionThreadLocal.get();
        try{
            if(transaction != null){
                transaction.commit();
            }
            transactionThreadLocal.set(null);
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    public static void rollbackTransaction(){
        Transaction transaction = (Transaction) transactionThreadLocal.get();
        try{
            transactionThreadLocal.set(null);
            if (transaction != null){
                transaction.rollback();
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }finally{
            closeSession();
        }
    }

    public static void setConfigFile(String configFile){
        HibernateSessionFactory.configFile = configFile;
        sessionFactory = null;
    }

    public static Configuration getConfiguration(){
        return configuration;
    }
}