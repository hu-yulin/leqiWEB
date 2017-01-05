package com.leqi.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class ClubActivityEntity {
    private int activityId;
    private int clubId;
    private String title;
    private String description;
    private String startTime;
    private String endTime;
    private String startPlace;
    private String endPlace;
    private String releaseTime;
    private String participateWay;
    private String requirement;

    private Set<ClubActivityPicEntity>clubActivityPicEntitySet=new HashSet<ClubActivityPicEntity>();

    public Set<ClubActivityPicEntity> getClubActivityPicEntitySet() {
        return clubActivityPicEntitySet;
    }

    public void setClubActivityPicEntitySet(Set<ClubActivityPicEntity> clubActivityPicEntitySet) {
        this.clubActivityPicEntitySet = clubActivityPicEntitySet;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getParticipateWay() {
        return participateWay;
    }

    public void setParticipateWay(String participateWay) {
        this.participateWay = participateWay;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubActivityEntity that = (ClubActivityEntity) o;

        if (activityId != that.activityId) return false;
        if (clubId != that.clubId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (startPlace != null ? !startPlace.equals(that.startPlace) : that.startPlace != null) return false;
        if (endPlace != null ? !endPlace.equals(that.endPlace) : that.endPlace != null) return false;
        if (releaseTime != null ? !releaseTime.equals(that.releaseTime) : that.releaseTime != null) return false;
        if (participateWay != null ? !participateWay.equals(that.participateWay) : that.participateWay != null)
            return false;
        if (requirement != null ? !requirement.equals(that.requirement) : that.requirement != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = activityId;
        result = 31 * result + clubId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (startPlace != null ? startPlace.hashCode() : 0);
        result = 31 * result + (endPlace != null ? endPlace.hashCode() : 0);
        result = 31 * result + (releaseTime != null ? releaseTime.hashCode() : 0);
        result = 31 * result + (participateWay != null ? participateWay.hashCode() : 0);
        result = 31 * result + (requirement != null ? requirement.hashCode() : 0);
        return result;
    }
}
