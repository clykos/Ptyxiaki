/**
 * Created by Giota on 8/6/2014.
 */
package test;


import ModelManager.DataOperations;
import ModelManager.Operations;

public class Main {
    public static void main(String[] args) {
        DataOperations op = new DataOperations();
        op.createUser("theodoridis", "admin", 50);
        System.out.println("-----");
        /*//op.deleteUser(4);
       // op.updateUser(3,"likos","user");
        op.createReport("pothehole", "most", null);
        op.createReport("pavement","none",null);
        op.updateReport(1,"traffic","less",null);
       // op.deleteReport(2);
        op.createComment("ngkfdjafgjyWEKBASDVIFUAY");
       // op.deleteComment(1);
        System.out.println("-----");*/

       /* Operations x = new Operations();
        x.create("Theodori","Diaxeiristis");
        System.out.println("-----");*/


    }
}
