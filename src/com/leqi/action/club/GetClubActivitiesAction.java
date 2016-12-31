package com.leqi.action.club;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.biz.clubBiz.ClubBiz;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubActivitiesAction extends ActionSupport {
    private int clubID;//需要从会话中获取
//    private int currentPage;
//    private int totalPage;
    private List<ClubActivityEntity> activites;

    public String getActivities(){
        ClubBiz clubBiz=new ClubControlBizImpl();
//        if(currentPage<1){
//            currentPage=1;
//        }
        clubID=5;
        int count=clubBiz.getAvtivitiesCount(clubID);
//        totalPage=(count%4==0)?(count/4):(count/4+1);
//        if(currentPage>totalPage){
//            currentPage=totalPage;
//        }
        activites=clubBiz.getClubActivities(clubID);
        return SUCCESS;
    }





    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public List<ClubActivityEntity> getActivites() {
        return activites;
    }

    public void setActivites(List<ClubActivityEntity> activites) {
        this.activites = activites;
    }
}
