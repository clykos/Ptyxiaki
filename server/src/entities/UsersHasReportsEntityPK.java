package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Giota on 2/7/2014.
 */
public class UsersHasReportsEntityPK implements Serializable {
    private int usersIdusers;
    private int reportsIdreports;

    @Column(name = "users_idusers")
    @Id
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Column(name = "reports_idreports")
    @Id
    public int getReportsIdreports() {
        return reportsIdreports;
    }

    public void setReportsIdreports(int reportsIdreports) {
        this.reportsIdreports = reportsIdreports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersHasReportsEntityPK that = (UsersHasReportsEntityPK) o;

        if (reportsIdreports != that.reportsIdreports) return false;
        if (usersIdusers != that.usersIdusers) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usersIdusers;
        result = 31 * result + reportsIdreports;
        return result;
    }
}
