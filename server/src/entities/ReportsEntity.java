package entities;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Giota on 2/7/2014.
 */
@Entity
@Table(name = "reports", schema = "", catalog = "project")
public class ReportsEntity {
    private int idreports;
    private String title;
    private String significance;
    private byte[] photo;
    private Integer idmissions;
    private String status;

    @Id
    @Column(name = "idreports")
    public int getIdreports() {
        return idreports;
    }

    public void setIdreports(int idreports) {
        this.idreports = idreports;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "significance")
    public String getSignificance() {
        return significance;
    }

    public void setSignificance(String significance) {
        this.significance = significance;
    }

    @Basic
    @Column(name = "photo")
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "idmissions")
    public Integer getIdmissions() {
        return idmissions;
    }

    public void setIdmissions(Integer idmissions) {
        this.idmissions = idmissions;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportsEntity that = (ReportsEntity) o;

        if (idreports != that.idreports) return false;
        if (idmissions != null ? !idmissions.equals(that.idmissions) : that.idmissions != null) return false;
        if (!Arrays.equals(photo, that.photo)) return false;
        if (significance != null ? !significance.equals(that.significance) : that.significance != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idreports;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (significance != null ? significance.hashCode() : 0);
        result = 31 * result + (photo != null ? Arrays.hashCode(photo) : 0);
        result = 31 * result + (idmissions != null ? idmissions.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
