<%@ page import="java.sql.*" %>
<%@ page import="ModelManager.DataOperations" %>
<%

    String title = request.getParameter("tle");
    String description = request.getParameter("desc");
    int score = Integer.parseInt(request.getParameter("quantity"));
    //Timestamp sday = request.getParameter("sbday");
    //Timestamp fday = request.getParameter("fbday");
    DataOperations op = new DataOperations();
    op.createMission(title,description,score,null,null);

%>