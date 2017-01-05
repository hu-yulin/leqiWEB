package com.leqi.action.mobile;

import com.leqi.bean.ClubEntity;
import com.leqi.biz.management.ManageClubBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * Created by lenovo on 2017/1/4.
 */
public class GetAllClubs extends ActionSupport {
    private JSONArray result;

    public String getAllClubsForMobile(){
        List<ClubEntity> clubs=new ManageClubBizImpl().getALLClubs();

        JSONArray jsonObject=JSONArray.fromObject(clubs);
        result=jsonObject;

        //result=jsonObject.toString();
        return SUCCESS;
    }

    public JSONArray getResult() {
        return result;
    }

    public void setResult(JSONArray result) {
        this.result = result;
    }
}
