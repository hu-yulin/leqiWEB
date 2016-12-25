package bean;

/**
 * Created by mbshqqb on 16-12-25.
 */
public class ActivityPicEntity {
    private int picId;
    private int activityId;
    private String path;

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityPicEntity that = (ActivityPicEntity) o;

        if (picId != that.picId) return false;
        if (activityId != that.activityId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = picId;
        result = 31 * result + activityId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
