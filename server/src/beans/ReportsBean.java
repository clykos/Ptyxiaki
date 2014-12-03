package beans;

/**
 * Created by Giota on 2/7/2014.
 */
public class ReportsBean {
    private int idreports;
    private String title;
    private String significance;
    private byte[] photo;
    private String status;

    public int getIdreports() {
        return idreports;
    }

    public void setIdreports(int idreports) {
        this.idreports = idreports;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSignificance() {
        return significance;
    }

    public void setSignificance(String significance) {
        this.significance = significance;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
