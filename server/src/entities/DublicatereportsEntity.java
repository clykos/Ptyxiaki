package entities;

import javax.persistence.*;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "dublicatereports", schema = "", catalog = "project")
@IdClass(DublicatereportsEntityPK.class)
public class DublicatereportsEntity {
    private int reportIdSource;
    private int reportIdDublicate;
    private ReportsEntity reportsByReportIdDublicate;
    private ReportsEntity reportsByReportIdSource;

    @Id
    @Column(name = "reportIdSource", nullable = false, insertable = true, updatable = true)
    public int getReportIdSource() {
        return reportIdSource;
    }

    public void setReportIdSource(int reportIdSource) {
        this.reportIdSource = reportIdSource;
    }

    @Id
    @Column(name = "reportIdDublicate", nullable = false, insertable = true, updatable = true)
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

    @ManyToOne
    @JoinColumn(name = "reportIdDublicate", referencedColumnName = "idreports", nullable = false)
    public ReportsEntity getReportsByReportIdDublicate() {
        return reportsByReportIdDublicate;
    }

    public void setReportsByReportIdDublicate(ReportsEntity reportsByReportIdDublicate) {
        this.reportsByReportIdDublicate = reportsByReportIdDublicate;
    }

    @ManyToOne
    @JoinColumn(name = "reportIdSource", referencedColumnName = "idreports", nullable = false)
    public ReportsEntity getReportsByReportIdSource() {
        return reportsByReportIdSource;
    }

    public void setReportsByReportIdSource(ReportsEntity reportsByReportIdSource) {
        this.reportsByReportIdSource = reportsByReportIdSource;
    }
}
