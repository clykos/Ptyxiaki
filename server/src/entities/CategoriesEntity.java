package entities;

import javax.persistence.*;

/**
 * Created by Giota on 2/7/2014.
 */
@Entity
@Table(name = "categories", schema = "", catalog = "project")
public class CategoriesEntity {
    private int idCategories;
    private String title;

    @Id
    @Column(name = "idCategories")
    public int getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(int idCategories) {
        this.idCategories = idCategories;
    }

    @Basic
    @Column(name = "title")
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
}
