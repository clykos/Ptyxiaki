package entities;

import javax.persistence.*;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "users_has_reports", schema = "", catalog = "project")
@IdClass(UsersHasReportsEntityPK.class)
public class UsersHasReportsEntity {
    private int usersIdusers;
    private int reportsIdreports;
    private ReportsEntity reportsByReportsIdreports;
    private UsersEntity usersByUsersIdusers;

    @Id
    @Column(name = "users_idusers", nullable = false, insertable = true, updatable = true)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Id
    @Column(name = "reports_idreports", nullable = false, insertable = true, updatable = true)
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

    @ManyToOne
    @JoinColumn(name = "reports_idreports", referencedColumnName = "idreports", nullable = false)
    public ReportsEntity getReportsByReportsIdreports() {
        return reportsByReportsIdreports;
    }

    public void setReportsByReportsIdreports(ReportsEntity reportsByReportsIdreports) {
        this.reportsByReportsIdreports = reportsByReportsIdreports;
    }

    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
    }
}
