package bean;

/**
 * Created by mbshqqb on 16-12-25.
 */
public class UserPicEntity {
    private int userId;
    private String path;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

        UserPicEntity that = (UserPicEntity) o;

        if (userId != that.userId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
