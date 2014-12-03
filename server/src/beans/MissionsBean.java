package beans;

import java.sql.Timestamp;

/**
 * Created by Giota on 2/7/2014.
 */
public class MissionsBean {
    private int idmissions;
    private Integer score;
    private Timestamp startDate;
    private Timestamp finalDate;

    public Timestamp getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Timestamp finalDate) {
        this.finalDate = finalDate;
    }

    public int getIdmissions() {
        return idmissions;
    }

    public void setIdmissions(int idmissions) {
        this.idmissions = idmissions;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }
}
