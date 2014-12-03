package beans;


/**
 * Created by Giota on 2/7/2014.
 */
public class CommentBean {
    private int idcomment;
    private Integer idreports;
    private Integer idusers;
    private String text;

    public int getIdcomment() {
        return idcomment;
    }

    public void setIdcomment(int idcomment) {
        this.idcomment = idcomment;
    }

    public Integer getIdreports() {
        return idreports;
    }

    public void setIdreports(Integer idreports) {
        this.idreports = idreports;
    }

    public Integer getIdusers() {
        return idusers;
    }

    public void setIdusers(Integer idusers) {
        this.idusers = idusers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
