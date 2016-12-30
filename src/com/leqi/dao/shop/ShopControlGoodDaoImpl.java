package com.leqi.dao.shop;

import com.leqi.bean.GoodEntity;
import com.leqi.bean.GoodPicEntity;
import com.leqi.bean.ShopEntity;
import com.leqi.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2016/12/27.
 */
public class ShopControlGoodDaoImpl implements ShopControlGoodDao {
    @Override
    public List<GoodEntity> getShopGoods(int shopID, int currentPage) {
        //每页放置12个商品。
        List<GoodEntity> goods=new ArrayList<>();
        int pageSize=12;
        int startIndex=(currentPage-1)*pageSize;
        Session session=HibernateSessionFactory.getSession();
        String hql="from GoodEntity  b where b.shopId=:shopid";
        Query query=session.createQuery(hql);
        query.setParameter("shopid",shopID);
        query.setFirstResult(startIndex);
        query.setMaxResults(pageSize);
        List list=query.list();
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            GoodEntity good= (GoodEntity) iterator.next();
            goods.add(good);
        }
        session.close();
        return goods;
    }

    @Override
    public GoodEntity getGoodDetail(int goodID) {
        Session session= HibernateSessionFactory.getSession();
        GoodEntity good=session.get(GoodEntity.class,goodID);
        session.close();
        return good;
    }

    @Override
    public void removeGood(int goodID,String path) {
        Session session=HibernateSessionFactory.getSession();
        Transaction tr=null;
        GoodEntity good=session.get(GoodEntity.class,goodID);
        tr=session.beginTransaction();
        //在删除之前需要找到对应的图片文件 删除
        Set<GoodPicEntity> pics=good.getGoodPicEntitySet();
        Iterator<GoodPicEntity> picsIterator=pics.iterator();
        while(picsIterator.hasNext()){
            GoodPicEntity temp=picsIterator.next();
            File pic=new File(path+temp.getPath());
            pic.delete();
        }
        session.delete(good);
        tr.commit();
    }

    @Override
    public void addGood(GoodEntity good) {
        Transaction tr=null;
        Session session= HibernateSessionFactory.getSession();
        tr=session.beginTransaction();
        session.save(good);
        tr.commit();
        HibernateSessionFactory.closeSession();
    }

    @Override
    public int getGoodsCount(int shopID) {
        Session session=HibernateSessionFactory.getSession();
        String hql="select count(b) from GoodEntity b where b.shopId=:shopid";
        Query query=session.createQuery(hql);
        query.setParameter("shopid",shopID);
        Long count= (Long) query.uniqueResult();
        session.close();
        return new Long(count).intValue();
    }
}
