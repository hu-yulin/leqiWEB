package com.leqi.action.club;

import com.leqi.action.GetUserID;
import com.leqi.bean.ClubActivityEntity;
import com.leqi.biz.clubBiz.ClubBiz;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubActivitiesAction extends ActionSupport {

//    private int currentPage;
//    private int totalPage;
    private List<ClubActivityEntity> activites;
    private String headPic;
    public String getActivities(){
        ClubBiz clubBiz=new ClubControlBizImpl();
//        if(currentPage<1){
//            currentPage=1;
//        }
        int clubID=new GetUserID().getUserID();
        if(clubID==-1){
            return "login";
        }
        int count=clubBiz.getAvtivitiesCount(clubID);
//        totalPage=(count%4==0)?(count/4):(count/4+1);
//        if(currentPage>totalPage){
//            currentPage=totalPage;
//        }
        activites=clubBiz.getClubActivities(clubID);
        headPic=clubBiz.getClubHeadPic(clubID);
        return SUCCESS;
    }


    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public List<ClubActivityEntity> getActivites() {
        return activites;
    }

    public void setActivites(List<ClubActivityEntity> activites) {
        this.activites = activites;
    }
}
