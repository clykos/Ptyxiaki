package ModelManager;

import java.sql.Timestamp;

/**
 * Created by Xristos on 14/6/2014.
 */
public class Operations {
    DataOperations dp = new DataOperations();

    public void create(String username, String role, int score) {
        dp.createUser(username, role, score);
    }

    public void update(int id, String name, String role, int score) {
        dp.updateUser(id, name, role, score);
    }

    public void delete(int idusers) {
        dp.deleteUser(idusers);
    }

    public void createR(String title, String description, String significance, byte[] photo) {
        dp.createReport(title, description, significance, photo);
    }

    public void updateR(int idreports, String title, String significance, byte[] photo) {
        dp.updateReport(idreports, title, significance, photo);
    }

    public void deleteR(int idreports) {
        dp.deleteReport(idreports);
    }

    public void createComm(String text) {
        dp.createComment(text);
    }

    public void deleteComm(int idcomment) {
        dp.deleteComment(idcomment);
    }

    public void createM(String title, String description, int score,Timestamp startDate,Timestamp finalDate){
        dp.createMission(title, description, score,startDate,finalDate);
    }

    public void updateM(int idmissions ,int score,Timestamp startDate,Timestamp finalDate){
        dp.updateMission(idmissions,score,startDate,finalDate);
    }

    public void deleteM(int idmissions){
        dp.deleteMission(idmissions);
    }

    public void login(int iduser,String username,String password){
        dp.login(iduser,username,password);
    }
}