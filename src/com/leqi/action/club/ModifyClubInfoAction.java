package com.leqi.action.club;

import com.leqi.action.GetUserID;
import com.leqi.bean.ClubEntity;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/30.
 */
public class ModifyClubInfoAction extends ActionSupport {

    private ClubEntity club;

    public String modifyClubInfo(){
        int clubID=new GetUserID().getUserID();
        if(clubID==-1){
            return "login";
        }
        ClubControlBizImpl clubControlBiz=new ClubControlBizImpl();
        clubControlBiz.changeClubInfo(clubID,club);
        return SUCCESS;
    }

    public ClubEntity getClub() {
        return club;
    }

    public void setClub(ClubEntity club) {
        this.club = club;
    }
}
