package bean;

/**
 * Created by mbshqqb on 16-12-25.
 */
public class ParticipateActivityEntity {
    private int userId;
    private int activityId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParticipateActivityEntity that = (ParticipateActivityEntity) o;

        if (userId != that.userId) return false;
        if (activityId != that.activityId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + activityId;
        return result;
    }
}
