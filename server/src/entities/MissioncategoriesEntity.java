package entities;

import javax.persistence.*;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "missioncategories", schema = "", catalog = "project")
@IdClass(MissioncategoriesEntityPK.class)
public class MissioncategoriesEntity {
    private int missId;
    private int catId;
    private CategoriesEntity categoriesByCatId;
    private MissionsEntity missionsByMissId;

    @Id
    @Column(name = "missId", nullable = false, insertable = true, updatable = true)
    public int getMissId() {
        return missId;
    }

    public void setMissId(int missId) {
        this.missId = missId;
    }

    @Id
    @Column(name = "catId", nullable = false, insertable = true, updatable = true)
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

    @ManyToOne
    @JoinColumn(name = "catId", referencedColumnName = "idCategories", nullable = false)
    public CategoriesEntity getCategoriesByCatId() {
        return categoriesByCatId;
    }

    public void setCategoriesByCatId(CategoriesEntity categoriesByCatId) {
        this.categoriesByCatId = categoriesByCatId;
    }

    @ManyToOne
    @JoinColumn(name = "missId", referencedColumnName = "idmissions", nullable = false)
    public MissionsEntity getMissionsByMissId() {
        return missionsByMissId;
    }

    public void setMissionsByMissId(MissionsEntity missionsByMissId) {
        this.missionsByMissId = missionsByMissId;
    }
}
