package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Xristos on 9/12/2014.
 */
public class ReportcategoriesEntityPK implements Serializable {
    private int rId;
    private int cId;

    @Column(name = "rId", nullable = false, insertable = true, updatable = true)
    @Id
    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    @Column(name = "cId", nullable = false, insertable = true, updatable = true)
    @Id
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

        ReportcategoriesEntityPK that = (ReportcategoriesEntityPK) o;

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
