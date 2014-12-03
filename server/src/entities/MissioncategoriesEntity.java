package entities;

import javax.persistence.*;

/**
 * Created by Giota on 2/7/2014.
 */
@Entity
@Table(name = "missioncategories", schema = "", catalog = "project")
@IdClass(MissioncategoriesEntityPK.class)
public class MissioncategoriesEntity {
    private int missId;
    private int catId;

    @Id
    @Column(name = "missId")
    public int getMissId() {
        return missId;
    }

    public void setMissId(int missId) {
        this.missId = missId;
    }

    @Id
    @Column(name = "catId")
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

        MissioncategoriesEntity that = (MissioncategoriesEntity) o;

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
