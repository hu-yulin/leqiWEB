package bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mbshqqb on 16-12-25.
 */
public class RouteShareEntity {
    private int shareId;
    private int userId;
    private String theme;
    private String description;
    private Timestamp startTime;
    private Timestamp endTime;
    private String startPlace;
    private String endPlace;
    private int hitCount;

    private Set<RouteSharePicEntity> routeSharePicEntities=new HashSet<RouteSharePicEntity>();

    public Set<RouteSharePicEntity> getRouteSharePicEntities() {
        return routeSharePicEntities;
    }

    public void setRouteSharePicEntities(Set<RouteSharePicEntity> routeSharePicEntities) {
        this.routeSharePicEntities = routeSharePicEntities;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
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

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RouteShareEntity that = (RouteShareEntity) o;

        if (shareId != that.shareId) return false;
        if (userId != that.userId) return false;
        if (hitCount != that.hitCount) return false;
        if (theme != null ? !theme.equals(that.theme) : that.theme != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (startPlace != null ? !startPlace.equals(that.startPlace) : that.startPlace != null) return false;
        if (endPlace != null ? !endPlace.equals(that.endPlace) : that.endPlace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shareId;
        result = 31 * result + userId;
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (startPlace != null ? startPlace.hashCode() : 0);
        result = 31 * result + (endPlace != null ? endPlace.hashCode() : 0);
        result = 31 * result + hitCount;
        return result;
    }
}
