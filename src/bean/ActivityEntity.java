package bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mbshqqb on 16-12-25.
 */
public class ActivityEntity {
    private int activityId;
    private int userId;
    private String title;
    private String description;
    private Timestamp startTime;
    private Timestamp endTime;
    private String startPlace;
    private String endPlace;
    private Timestamp releaseTime;
    private String participateWay;
    private String requirement;

    private Set<ActivityPicEntity> activityPicEntities=new HashSet<ActivityPicEntity>();//一对多映射

    public Set<ActivityPicEntity> getActivityPicEntities() {
        return activityPicEntities;
    }

    public void setActivityPicEntities(Set<ActivityPicEntity> activityPicEntities) {
        this.activityPicEntities = activityPicEntities;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
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

    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
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

        ActivityEntity that = (ActivityEntity) o;

        if (activityId != that.activityId) return false;
        if (userId != that.userId) return false;
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
        result = 31 * result + userId;
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
