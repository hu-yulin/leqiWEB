package test.bean;

import com.leqi.bean.GoodEntity;
import com.leqi.bean.GoodPicEntity;
import com.leqi.bean.ShopEntity;
import com.leqi.bean.UserEntity;
import com.leqi.biz.shop.ShopControlBizImpl;
import com.leqi.dao.management.ManageDaoImpl;
import com.leqi.dao.management.ManageShopDaoImpl;
import com.leqi.dao.shop.ShopControlDaoImpl;
import com.leqi.dao.shop.ShopControlGoodDaoImpl;

import java.util.List;

/**
 * Created by lenovo on 2016/12/27.
 */
public class test {
    public static void main(String [] args){
        ShopControlGoodDaoImpl shopControlGoodDao=new ShopControlGoodDaoImpl();
//        GoodEntity good=new GoodEntity();
//        good.setDescription("ceshi");
//        good.setShopId(2);
//        good.setBrand("a");
//        good.setName("ceshi");
//        good.setCurrentPrice(11);
//        good.setHitCount(1);
//        GoodPicEntity a=new GoodPicEntity();
//        a.setPath("www");
//        good.getGoodPicEntitySet().add(a);
//        shopControlGoodDao.AddGoodAction(good);


//        List<GoodEntity> goods=shopControlGoodDao.getShopGoods(2,1);
//        System.out.println(goods.size());


//        ShopControlBizImpl shopControlBiz=new ShopControlBizImpl();
//        ShopEntity shop=shopControlBiz.getShopInfo(2);
//        System.out.println("level "+shop.getLevel());

//        ManageDaoImpl manageDao=new ManageDaoImpl();
//        UserEntity user=new UserEntity();
//        user.setUserType(1);
//        user.setPassword("huyulin");
//        user.setUsername("huyulin");
//        manageDao.addUser(user);

        ManageShopDaoImpl manageShopDao=new ManageShopDaoImpl();
        manageShopDao.getAllShops();
    }
}
