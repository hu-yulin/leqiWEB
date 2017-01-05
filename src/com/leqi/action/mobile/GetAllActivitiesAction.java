package com.leqi.action.mobile;

import com.leqi.bean.ClubActivityEntity;
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
public class GetAllActivitiesAction extends ActionSupport {
    private JSONArray result;

    public String getAllActivities(){
        List<ClubActivityEntity> clubActivityEntities;
        clubActivityEntities=new MobileBiz().getAllActivities();
        result=JSONArray.fromObject(clubActivityEntities);

        return SUCCESS;
    }

    public JSONArray getResult() {
        return result;
    }

    public void setResult(JSONArray result) {
        this.result = result;
    }
}
