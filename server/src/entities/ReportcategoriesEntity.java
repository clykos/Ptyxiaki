package entities;

import javax.persistence.*;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "reportcategories", schema = "", catalog = "project")
@IdClass(ReportcategoriesEntityPK.class)
public class ReportcategoriesEntity {
    private int rId;
    private int cId;
    private CategoriesEntity categoriesByCId;
    private ReportsEntity reportsByRId;

    @Id
    @Column(name = "rId", nullable = false, insertable = true, updatable = true)
    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    @Id
    @Column(name = "cId", nullable = false, insertable = true, updatable = true)
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportcategoriesEntity that = (ReportcategoriesEntity) o;

        if (cId != that.cId) return false;
        if (rId != that.rId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rId;
        result = 31 * result + cId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cId", referencedColumnName = "idCategories", nullable = false)
    public CategoriesEntity getCategoriesByCId() {
        return categoriesByCId;
    }

    public void setCategoriesByCId(CategoriesEntity categoriesByCId) {
        this.categoriesByCId = categoriesByCId;
    }

    @ManyToOne
    @JoinColumn(name = "rId", referencedColumnName = "idreports", nullable = false)
    public ReportsEntity getReportsByRId() {
        return reportsByRId;
    }

    public void setReportsByRId(ReportsEntity reportsByRId) {
        this.reportsByRId = reportsByRId;
    }
}
