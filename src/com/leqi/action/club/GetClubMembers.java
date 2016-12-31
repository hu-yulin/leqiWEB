package com.leqi.action.club;

import com.leqi.bean.RiderEntity;
import com.leqi.dao.club.GetClubMembersDaoIml;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubMembers extends ActionSupport {
    private int clubID;//会话中获取
    private List<RiderEntity> riders;

    public String getClubMembers() throws ClassNotFoundException, SQLException {
        GetClubMembersDaoIml get=new GetClubMembersDaoIml();
        clubID=5;
        riders=get.getMembers(clubID);
        return SUCCESS;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public List<RiderEntity> getRiders() {
        return riders;
    }

    public void setRiders(List<RiderEntity> riders) {
        this.riders = riders;
    }
}
