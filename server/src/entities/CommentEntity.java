package entities;

import javax.persistence.*;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "comment", schema = "", catalog = "project")
public class CommentEntity {
    private int idcomment;
    private Integer idreports;
    private Integer idusers;
    private String text;
    private ReportsEntity reportsByIdreports;
    private UsersEntity usersByIdusers;

    @Id
    @Column(name = "idcomment", nullable = false, insertable = true, updatable = true)
    public int getIdcomment() {
        return idcomment;
    }

    public void setIdcomment(int idcomment) {
        this.idcomment = idcomment;
    }

    @Basic
    @Column(name = "idreports", nullable = true, insertable = true, updatable = true)
    public Integer getIdreports() {
        return idreports;
    }

    public void setIdreports(Integer idreports) {
        this.idreports = idreports;
    }

    @Basic
    @Column(name = "idusers", nullable = true, insertable = true, updatable = true)
    public Integer getIdusers() {
        return idusers;
    }

    public void setIdusers(Integer idusers) {
        this.idusers = idusers;
    }

    @Basic
    @Column(name = "text", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (idcomment != that.idcomment) return false;
        if (idreports != null ? !idreports.equals(that.idreports) : that.idreports != null) return false;
        if (idusers != null ? !idusers.equals(that.idusers) : that.idusers != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcomment;
        result = 31 * result + (idreports != null ? idreports.hashCode() : 0);
        result = 31 * result + (idusers != null ? idusers.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    /*@ManyToOne
    @JoinColumn(name = "idreports", referencedColumnName = "idreports")
    public ReportsEntity getReportsByIdreports() {
        return reportsByIdreports;
    }

    public void setReportsByIdreports(ReportsEntity reportsByIdreports) {
        this.reportsByIdreports = reportsByIdreports;
    }

    @ManyToOne
    @JoinColumn(name = "idusers", referencedColumnName = "idusers")
    public UsersEntity getUsersByIdusers() {
        return usersByIdusers;
    }*/

    public void setUsersByIdusers(UsersEntity usersByIdusers) {
        this.usersByIdusers = usersByIdusers;
    }
}
