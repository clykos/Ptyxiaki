package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Giota on 2/7/2014.
 */
public class DublicatereportsEntityPK implements Serializable {
    private int reportIdSource;
    private int reportIdDublicate;

    @Column(name = "reportIdSource")
    @Id
    public int getReportIdSource() {
        return reportIdSource;
    }

    public void setReportIdSource(int reportIdSource) {
        this.reportIdSource = reportIdSource;
    }

    @Column(name = "reportIdDublicate")
    @Id
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

        DublicatereportsEntityPK that = (DublicatereportsEntityPK) o;

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
