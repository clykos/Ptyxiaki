package entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "categories", schema = "", catalog = "project")
public class CategoriesEntity {
    private int idCategories;
    private String title;
    private Collection<MissioncategoriesEntity> missioncategoriesesByIdCategories;
    private Collection<ReportcategoriesEntity> reportcategoriesesByIdCategories;

    @Id
    @Column(name = "idCategories", nullable = false, insertable = true, updatable = true)
    public int getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(int idCategories) {
        this.idCategories = idCategories;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriesEntity that = (CategoriesEntity) o;

        if (idCategories != that.idCategories) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategories;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoriesByCatId")
    public Collection<MissioncategoriesEntity> getMissioncategoriesesByIdCategories() {
        return missioncategoriesesByIdCategories;
    }

    public void setMissioncategoriesesByIdCategories(Collection<MissioncategoriesEntity> missioncategoriesesByIdCategories) {
        this.missioncategoriesesByIdCategories = missioncategoriesesByIdCategories;
    }

    @OneToMany(mappedBy = "categoriesByCId")
    public Collection<ReportcategoriesEntity> getReportcategoriesesByIdCategories() {
        return reportcategoriesesByIdCategories;
    }

    public void setReportcategoriesesByIdCategories(Collection<ReportcategoriesEntity> reportcategoriesesByIdCategories) {
        this.reportcategoriesesByIdCategories = reportcategoriesesByIdCategories;
    }
}
