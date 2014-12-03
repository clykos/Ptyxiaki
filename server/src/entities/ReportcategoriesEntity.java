package entities;

import javax.persistence.*;

/**
 * Created by Giota on 2/7/2014.
 */
@Entity
@Table(name = "reportcategories", schema = "", catalog = "project")
@IdClass(ReportcategoriesEntityPK.class)
public class ReportcategoriesEntity {
    private int rId;
    private int cId;

    @Id
    @Column(name = "rId")
    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    @Id
    @Column(name = "cId")
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
}
