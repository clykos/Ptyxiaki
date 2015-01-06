package webservice;

import ModelManager.Operations;
import beans.*;


import javax.jws.WebMethod;
import javax.xml.ws.Endpoint;
import java.sql.Timestamp;

/**
 * Created by Xristos on 25/6/2014.
 */
@javax.jws.WebService()
public class WebService {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    @WebMethod
    //Users
    public UserBean createUser(String username, String role, int score) {
        Operations op = new Operations();
        op.create(username, role, score);
        return new UserBean();
    }
    public UserBean deleteUser(int id) {
        Operations op = new Operations();
        op.delete(id);
        return new UserBean();
    }
    public UserBean updateUser(int id, String name, String role, int score) {
        Operations op = new Operations();
        op.update(id, name, role, score);
        return new UserBean();
    }

    //Reports
    public ReportsBean createReports(String title, String description, String significance, byte[] photo) {
        Operations op = new Operations();
        op.createR(title, description, significance, photo);
        return new ReportsBean();
    }
    public ReportsBean updateReports(int idreports, String title, String significance, byte[] photo) {
        Operations op = new Operations();
        op.updateR(idreports,title,significance,photo);
        return new ReportsBean();
    }
    public ReportsBean deleteReports(int idreports) {
        Operations op = new Operations();
        op.deleteR(idreports);
        return new ReportsBean();
    }

    //Comments
    public CommentBean createComment(String text) {
        Operations op = new Operations();
        op.createComm(text);
        return new CommentBean();
    }
    public CommentBean deleteComment(int idcomment) {
        Operations op = new Operations();
        op.deleteComm(idcomment);
        return new CommentBean();
    }

    //Missions
    public MissionsBean createMission(String title, String description, int score,Timestamp startDate,Timestamp finalDate) {
        Operations op = new Operations();
        op.createM(title, description, score, startDate, finalDate);
        return new MissionsBean();
    }

    public MissionsBean updateMissions(int idmissions ,int score,Timestamp startDate,Timestamp finalDate) {
        Operations op = new Operations();
        op.updateM(idmissions, score, startDate, finalDate);
        return new MissionsBean();
    }

    public MissionsBean deleteMissions(int idmissions) {
        Operations op = new Operations();
        op.deleteM(idmissions);
        return new MissionsBean();
    }

    //Login
    public LoginBean login(int iduser,String username,String password){
        Operations op = new Operations();
        op.login(iduser,username,password);
        return new LoginBean();
    }



    public static void main(String[] argv) {
        Object implementor = new WebService();
        String address = "http://localhost:8080/WebService";
        Endpoint.publish(address, implementor);
    }

}
