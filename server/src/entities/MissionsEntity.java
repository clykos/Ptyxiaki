package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "missions", schema = "", catalog = "project")
public class MissionsEntity {
    private int idmissions;
    private String description;
    private String title;
    private Integer score;
    private Timestamp startDate;
    private Timestamp finalDate;
    private Collection<MissioncategoriesEntity> missioncategoriesesByIdmissions;
    private Collection<ReportsEntity> reportsesByIdmissions;

    @Id
    @Column(name = "idmissions", nullable = false, insertable = true, updatable = true)
    public int getIdmissions() {
        return idmissions;
    }

    public void setIdmissions(int idmissions) {
        this.idmissions = idmissions;
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
    @Column(name = "score", nullable = true, insertable = true, updatable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "start_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "final_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Timestamp finalDate) {
        this.finalDate = finalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionsEntity that = (MissionsEntity) o;

        if (idmissions != that.idmissions) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (finalDate != null ? !finalDate.equals(that.finalDate) : that.finalDate != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmissions;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finalDate != null ? finalDate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "missionsByMissId")
    public Collection<MissioncategoriesEntity> getMissioncategoriesesByIdmissions() {
        return missioncategoriesesByIdmissions;
    }

    public void setMissioncategoriesesByIdmissions(Collection<MissioncategoriesEntity> missioncategoriesesByIdmissions) {
        this.missioncategoriesesByIdmissions = missioncategoriesesByIdmissions;
    }

    @OneToMany(mappedBy = "missionsByIdmissions")
    public Collection<ReportsEntity> getReportsesByIdmissions() {
        return reportsesByIdmissions;
    }

    public void setReportsesByIdmissions(Collection<ReportsEntity> reportsesByIdmissions) {
        this.reportsesByIdmissions = reportsesByIdmissions;
    }
}
