package bean;

/**
 * Created by mbshqqb on 16-12-25.
 */
public class ClubMemberEntity {
    private int userIdPerson;
    private int userIdClub;

    public int getUserIdPerson() {
        return userIdPerson;
    }

    public void setUserIdPerson(int userIdPerson) {
        this.userIdPerson = userIdPerson;
    }

    public int getUserIdClub() {
        return userIdClub;
    }

    public void setUserIdClub(int userIdClub) {
        this.userIdClub = userIdClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubMemberEntity that = (ClubMemberEntity) o;

        if (userIdPerson != that.userIdPerson) return false;
        if (userIdClub != that.userIdClub) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userIdPerson;
        result = 31 * result + userIdClub;
        return result;
    }
}
