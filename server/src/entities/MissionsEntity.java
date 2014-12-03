package entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Giota on 2/7/2014.
 */
@Entity
@Table(name = "missions", schema = "", catalog = "project")
public class MissionsEntity {
    private int idmissions;
    private Integer score;
    private Timestamp startDate;
    private Timestamp finalDate;

    @Id
    @Column(name = "idmissions")
    public int getIdmissions() {
        return idmissions;
    }

    public void setIdmissions(int idmissions) {
        this.idmissions = idmissions;
    }

    @Basic
    @Column(name = "score")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "start_date")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "final_date")
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
        if (finalDate != null ? !finalDate.equals(that.finalDate) : that.finalDate != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmissions;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finalDate != null ? finalDate.hashCode() : 0);
        return result;
    }
}
