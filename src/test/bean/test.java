package test.bean;

import com.leqi.bean.RiderEntity;
import com.leqi.biz.clubBiz.ClubBiz;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.leqi.dao.club.GetClubMembersDaoIml;
import com.leqi.dao.management.ManageShopDaoImpl;
import com.leqi.dao.shop.ShopControlGoodDaoImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

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

        try {
            GetClubMembersDaoIml get=new GetClubMembersDaoIml();
            List<RiderEntity> s=get.getMembers(5);
            System.out.println(s.size());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
