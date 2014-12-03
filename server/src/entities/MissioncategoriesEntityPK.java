package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Giota on 2/7/2014.
 */
public class MissioncategoriesEntityPK implements Serializable {
    private int missId;
    private int catId;

    @Column(name = "missId")
    @Id
    public int getMissId() {
        return missId;
    }

    public void setMissId(int missId) {
        this.missId = missId;
    }

    @Column(name = "catId")
    @Id
    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissioncategoriesEntityPK that = (MissioncategoriesEntityPK) o;

        if (catId != that.catId) return false;
        if (missId != that.missId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = missId;
        result = 31 * result + catId;
        return result;
    }
}
