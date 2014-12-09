package entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Xristos on 9/12/2014.
 */
@Entity
@Table(name = "users", schema = "", catalog = "project")
public class UsersEntity {
    private int idusers;
    private String username;
    private String role;
    private Integer score;
    private Collection<CommentEntity> commentsByIdusers;
    private LoginEntity loginByIdusers;
    private Collection<UsersHasReportsEntity> usersHasReportsesByIdusers;

    @Id
    @Column(name = "idusers", nullable = false, insertable = true, updatable = true)
    public int getIdusers() {
        return idusers;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    @Basic
    @Column(name = "username", nullable = true, insertable = true, updatable = true, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "role", nullable = true, insertable = true, updatable = true, length = 45)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "score", nullable = true, insertable = true, updatable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (idusers != that.idusers) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idusers;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usersByIdusers")
    public Collection<CommentEntity> getCommentsByIdusers() {
        return commentsByIdusers;
    }

    public void setCommentsByIdusers(Collection<CommentEntity> commentsByIdusers) {
        this.commentsByIdusers = commentsByIdusers;
    }

    @OneToOne(mappedBy = "usersByIduser")
    public LoginEntity getLoginByIdusers() {
        return loginByIdusers;
    }

    public void setLoginByIdusers(LoginEntity loginByIdusers) {
        this.loginByIdusers = loginByIdusers;
    }

    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<UsersHasReportsEntity> getUsersHasReportsesByIdusers() {
        return usersHasReportsesByIdusers;
    }

    public void setUsersHasReportsesByIdusers(Collection<UsersHasReportsEntity> usersHasReportsesByIdusers) {
        this.usersHasReportsesByIdusers = usersHasReportsesByIdusers;
    }
}
