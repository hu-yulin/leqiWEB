package bean;

/**
 * Created by mbshqqb on 16-12-25.
 */
public class GoodPicEntity {
    private int goodId;
    private String path;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
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

        GoodPicEntity that = (GoodPicEntity) o;

        if (goodId != that.goodId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
