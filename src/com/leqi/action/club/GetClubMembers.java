package com.leqi.action.club;

import com.leqi.action.GetUserID;
import com.leqi.bean.RiderEntity;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.leqi.dao.club.GetClubMembersDaoIml;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubMembers extends ActionSupport {

    private List<RiderEntity> riders;
    private String headPic;
    public String getClubMembers() throws ClassNotFoundException, SQLException {
        GetClubMembersDaoIml get=new GetClubMembersDaoIml();
        int clubID=new GetUserID().getUserID();
        if(clubID==-1){
            return "login";
        }
        riders=get.getMembers(clubID);
        ClubControlBizImpl clubControlBiz=new ClubControlBizImpl();
        headPic=clubControlBiz.getClubHeadPic(clubID);
        return SUCCESS;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public List<RiderEntity> getRiders() {
        return riders;
    }

    public void setRiders(List<RiderEntity> riders) {
        this.riders = riders;
    }
}
