package entities;

import javax.persistence.*;

/**
 * Created by Giota on 2/7/2014.
 */
@Entity
@Table(name = "users_has_reports", schema = "", catalog = "project")
@IdClass(UsersHasReportsEntityPK.class)
public class UsersHasReportsEntity {
    private int usersIdusers;
    private int reportsIdreports;

    @Id
    @Column(name = "users_idusers")
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Id
    @Column(name = "reports_idreports")
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

        UsersHasReportsEntity that = (UsersHasReportsEntity) o;

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
