package entities;

import javax.persistence.*;

/**
 * Created by Giota on 2/7/2014.
 */
@Entity
@Table(name = "dublicatereports", schema = "", catalog = "project")
@IdClass(DublicatereportsEntityPK.class)
public class DublicatereportsEntity {
    private int reportIdSource;
    private int reportIdDublicate;

    @Id
    @Column(name = "reportIdSource")
    public int getReportIdSource() {
        return reportIdSource;
    }

    public void setReportIdSource(int reportIdSource) {
        this.reportIdSource = reportIdSource;
    }

    @Id
    @Column(name = "reportIdDublicate")
    public int getReportIdDublicate() {
        return reportIdDublicate;
    }

    public void setReportIdDublicate(int reportIdDublicate) {
        this.reportIdDublicate = reportIdDublicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DublicatereportsEntity that = (DublicatereportsEntity) o;

        if (reportIdDublicate != that.reportIdDublicate) return false;
        if (reportIdSource != that.reportIdSource) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportIdSource;
        result = 31 * result + reportIdDublicate;
        return result;
    }
}
