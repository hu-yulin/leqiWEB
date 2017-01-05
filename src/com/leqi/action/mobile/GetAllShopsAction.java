package com.leqi.action.mobile;

import com.leqi.bean.ShopEntity;
import com.leqi.biz.management.ManageClubBizImpl;
import com.leqi.biz.management.ManageShopBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/1/4.
 */
public class GetAllShopsAction extends ActionSupport {
    private JSONArray result;

    public String getAllShops(){
        List<ShopEntity> shops=new ArrayList<>();
        shops=new ManageShopBizImpl().getAllShops();
        result=JSONArray.fromObject(shops);
        return SUCCESS;
    }

    public JSONArray getResult() {
        return result;
    }

    public void setResult(JSONArray result) {
        this.result = result;
    }
}
