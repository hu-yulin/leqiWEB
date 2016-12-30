package com.leqi.action.shop;

import com.leqi.bean.GoodEntity;
import com.leqi.bean.ShopEntity;
import com.leqi.biz.shop.ShopControlBizImpl;
import com.leqi.biz.shop.ShopControlOfGoodBizImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * @author huyulin
 * Created by lenovo on 2016/12/27.
 */
public class ShopAction extends ActionSupport{
    private int shopID;//传值
    private int currentPage;//传值

    private ShopEntity shop;//shopHomepage页面使用
    private List<GoodEntity> goods;//allGoods页面使用
    private int totalPage;//allGoods页面使用

    public String getShopInfo(){
       //需要先判断shopID是否有值，可以考虑拦截器等实现
        shopID=2;
        ShopControlBizImpl shopControlBiz=new ShopControlBizImpl();
        shop=shopControlBiz.getShopInfo(shopID);

        return SUCCESS;
    }

    public String getShopGoods(){
        //需要先判断shopID是否有值，可以考虑拦截器等实现
        if(currentPage<1){
            currentPage=1;
        }
        ShopControlOfGoodBizImpl shopControlOfGoodBiz=new ShopControlOfGoodBizImpl();
        int count=shopControlOfGoodBiz.getGoodsCount(shopID);
        totalPage=(count%12==0)?(count/12):(count/12+1);
        if(currentPage>totalPage){
            currentPage=totalPage;
        }
        goods=shopControlOfGoodBiz.getShopGoods(shopID,currentPage);
        System.out.println(goods.size());
        return SUCCESS;
    }



    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    public List<GoodEntity> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodEntity> goods) {
        this.goods = goods;
    }
}
