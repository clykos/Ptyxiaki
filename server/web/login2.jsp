<%@ page import ="java.sql.*" %>
<%@ page import="ModelManager.DataOperations" %>
<%
    ResultSet rs;
    String userid = request.getParameter("uname");
    String pwd = request.getParameter("pass");
    DataOperations op = new DataOperations();
    rs = op.genuineUser(userid,pwd);
    if (rs.next()) {
        session.setAttribute("userid", userid);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("success.jsp");
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }

%>