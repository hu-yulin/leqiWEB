package com.leqi.action.mobile;

import com.leqi.bean.GoodEntity;
import com.leqi.biz.others.MobileBiz;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/1/4.
 */
public class GetShopGoodsAction extends ActionSupport {
    private JSONArray result;
    private int shopID;

    public String getShopGoods(){
        List<GoodEntity> goods=new MobileBiz().getShopGoods(shopID);
        result=JSONArray.fromObject(goods);
        return SUCCESS;
    }

    public JSONArray getResult() {
        return result;
    }

    public void setResult(JSONArray result) {
        this.result = result;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }
}
