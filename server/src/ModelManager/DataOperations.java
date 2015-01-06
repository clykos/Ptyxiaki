package ModelManager;

import entities.*;
import org.hibernate.Session;
import java.sql.*;
import java.sql.Timestamp;

/**
 * Created by Giota on 3/6/2014.
 */

public class DataOperations {

    public static UsersEntity createUser(String username, String role, int score) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        UsersEntity ue = new UsersEntity();
        ue.setUsername(username);
        ue.setRole(role);
        ue.setScore(score);
        session.saveOrUpdate(ue);
        session.getTransaction().commit();
        return ue;

    }

    public ResultSet genuineUser(String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project",
                "root", "root");
        Statement st = con.createStatement();
        ResultSet rs;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        rs = st.executeQuery("select * from login where username='" + username + "' and password='" + password + "'");
        return rs;

    }

    public ResultSet viewReport()throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project",
                "root", "root");
        Statement st = con.createStatement();
        ResultSet rs;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        rs = st.executeQuery("select * from reports");
        return rs;
    }


    public UsersEntity updateUser(int idusers, String username, String role, int score) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        UsersEntity ue = (UsersEntity) session.get(UsersEntity.class, idusers);
        ue.setUsername(username);
        ue.setRole(role);
        ue.setScore(score);
        session.getTransaction().commit();
        return ue;
    }


    public UsersEntity deleteUser(int idusers) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        UsersEntity ue = (UsersEntity) session.get(UsersEntity.class, idusers);
        session.delete(ue);
        session.getTransaction().commit();
        return ue;

    }

    public LoginEntity login(int iduser,String username,String password){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        LoginEntity le = (LoginEntity) session.get(LoginEntity.class, iduser);
        le.setIduser(iduser);
        le.setUsername(username);
        le.setPassword(password);
        session.saveOrUpdate(le);
        session.getTransaction().commit();
        return le;

    }


    public ReportsEntity createReport(String title, String description, String significance, byte[] photo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ReportsEntity re = new ReportsEntity();
        re.setTitle(title);
        re.setDescription(description);
        re.setSignificance(significance);
        re.setPhoto(photo);
        session.saveOrUpdate(re);
        session.getTransaction().commit();
        return re;

    }


    public ReportsEntity updateReport(int idreports, String title, String significance, byte[] photo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ReportsEntity re = (ReportsEntity) session.get(ReportsEntity.class, idreports);
        re.setTitle(title);
        re.setSignificance(significance);
        re.setPhoto(photo);
        session.getTransaction().commit();
        return re;

    }


    public ReportsEntity deleteReport(int idreports) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ReportsEntity re = (ReportsEntity) session.get(ReportsEntity.class, idreports);
        session.delete(re);
        session.getTransaction().commit();
        return re;

    }

    public MissionsEntity createMission(String title, String description, int score,Timestamp startDate,Timestamp finalDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        MissionsEntity me = new MissionsEntity();
        me.setDescription(description);
        me.setTitle(title);
        me.setScore(score);
        me.setStartDate(startDate);
        me.setFinalDate(finalDate);
        session.saveOrUpdate(me);
        session.getTransaction().commit();
        return me;

    }

    public MissionsEntity updateMission(int idmissions ,int score,Timestamp startDate,Timestamp finalDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        MissionsEntity me = (MissionsEntity) session.get(MissionsEntity.class, idmissions);
        me.setScore(score);
        me.setStartDate(startDate);
        me.setFinalDate(finalDate);
        session.getTransaction().commit();
        return me;

    }

    public MissionsEntity deleteMission(int idmissions) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        MissionsEntity me = (MissionsEntity) session.get(MissionsEntity.class, idmissions);
        session.delete(me);
        session.getTransaction().commit();
        return me;

    }

    public CommentEntity createComment(String text){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        CommentEntity ce = new CommentEntity();
        ce.setText(text);
        session.saveOrUpdate(ce);
        session.getTransaction().commit();
        return ce;

    }

    public CommentEntity deleteComment (int idcomment) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        CommentEntity ce = (CommentEntity) session.get(CommentEntity.class, idcomment);
        session.delete(ce);
        session.getTransaction().commit();
        return ce;

    }
}
