package entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "reports", schema = "", catalog = "project")
public class ReportsEntity {
    private int idreports;
    private String description;
    private String title;
    private String significance;
    private byte[] photo;
    private Integer idmissions;
    private String status;
    private Collection<CommentEntity> commentsByIdreports;
    private Collection<DublicatereportsEntity> dublicatereportsesByIdreports;
    private Collection<DublicatereportsEntity> dublicatereportsesByIdreports_0;
    private Collection<ReportcategoriesEntity> reportcategoriesesByIdreports;
    private MissionsEntity missionsByIdmissions;
    private Collection<UsersHasReportsEntity> usersHasReportsesByIdreports;

    @Id
    @Column(name = "idreports", nullable = false, insertable = true, updatable = true)
    public int getIdreports() {
        return idreports;
    }

    public void setIdreports(int idreports) {
        this.idreports = idreports;
    }

    @Basic
    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "significance", nullable = true, insertable = true, updatable = true, length = 45)
    public String getSignificance() {
        return significance;
    }

    public void setSignificance(String significance) {
        this.significance = significance;
    }

    @Basic
    @Column(name = "photo", nullable = true, insertable = true, updatable = true)
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "idmissions", nullable = true, insertable = true, updatable = true)
    public Integer getIdmissions() {
        return idmissions;
    }

    public void setIdmissions(Integer idmissions) {
        this.idmissions = idmissions;
    }

    @Basic
    @Column(name = "status", nullable = true, insertable = true, updatable = true, length = 13)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportsEntity that = (ReportsEntity) o;

        if (idreports != that.idreports) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (idmissions != null ? !idmissions.equals(that.idmissions) : that.idmissions != null) return false;
        if (!Arrays.equals(photo, that.photo)) return false;
        if (significance != null ? !significance.equals(that.significance) : that.significance != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idreports;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (significance != null ? significance.hashCode() : 0);
        result = 31 * result + (photo != null ? Arrays.hashCode(photo) : 0);
        result = 31 * result + (idmissions != null ? idmissions.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "reportsByIdreports")
    public Collection<CommentEntity> getCommentsByIdreports() {
        return commentsByIdreports;
    }

    public void setCommentsByIdreports(Collection<CommentEntity> commentsByIdreports) {
        this.commentsByIdreports = commentsByIdreports;
    }

    @OneToMany(mappedBy = "reportsByReportIdDublicate")
    public Collection<DublicatereportsEntity> getDublicatereportsesByIdreports() {
        return dublicatereportsesByIdreports;
    }

    public void setDublicatereportsesByIdreports(Collection<DublicatereportsEntity> dublicatereportsesByIdreports) {
        this.dublicatereportsesByIdreports = dublicatereportsesByIdreports;
    }

    @OneToMany(mappedBy = "reportsByReportIdSource")
    public Collection<DublicatereportsEntity> getDublicatereportsesByIdreports_0() {
        return dublicatereportsesByIdreports_0;
    }

    public void setDublicatereportsesByIdreports_0(Collection<DublicatereportsEntity> dublicatereportsesByIdreports_0) {
        this.dublicatereportsesByIdreports_0 = dublicatereportsesByIdreports_0;
    }

    @OneToMany(mappedBy = "reportsByRId")
    public Collection<ReportcategoriesEntity> getReportcategoriesesByIdreports() {
        return reportcategoriesesByIdreports;
    }

    public void setReportcategoriesesByIdreports(Collection<ReportcategoriesEntity> reportcategoriesesByIdreports) {
        this.reportcategoriesesByIdreports = reportcategoriesesByIdreports;
    }

  /*  @ManyToOne
    @JoinColumn(name = "idmissions", referencedColumnName = "idmissions")
    public MissionsEntity getMissionsByIdmissions() {
        return missionsByIdmissions;
    }

    public void setMissionsByIdmissions(MissionsEntity missionsByIdmissions) {
        this.missionsByIdmissions = missionsByIdmissions;
    }

    @OneToMany(mappedBy = "reportsByReportsIdreports")
    public Collection<UsersHasReportsEntity> getUsersHasReportsesByIdreports() {
        return usersHasReportsesByIdreports;
    }

    public void setUsersHasReportsesByIdreports(Collection<UsersHasReportsEntity> usersHasReportsesByIdreports) {
        this.usersHasReportsesByIdreports = usersHasReportsesByIdreports;
    }*/
}
