package com.leqi.biz.shop;

import com.leqi.bean.GoodEntity;

import java.util.List;

/**
 * @author huyulin
 * Created by lenovo on 2016/12/27.
 */
public interface ShopControlOfGood {
    /**
     *
     * @param shopID
     * @param currentPage 当前页面数  根据页面数来查询实现分页
     * @return
     */
    public List<GoodEntity> getShopGoods(int shopID,int currentPage);

    public GoodEntity getGoodDetail(int goodID);

    public void removeGood(int goodID);

    public void addGood(GoodEntity good);

    public int getGoodsCount(int shopID);

}
