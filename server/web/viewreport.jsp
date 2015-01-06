<%@ page import="java.sql.*" %>
<%@ page import="ModelManager.DataOperations" %>
<html>
<head><title>Enter to database</title></head>
<body>
<table style="width:100%">
    <tr>
        <td>Title</td>
        <td>Description</td>
        <td>Significance</td>
    </tr>
        <%
    ResultSet rs;
    DataOperations op = new DataOperations();
    rs = op.viewReport();
    while (rs.next()) {
%>
    <tr>
        <td><%= rs.getString("title") %>
        </td>
        <td><%= rs.getString("description") %>
        </td>
        <td><%= rs.getString("significance") %>
        </td>
    </tr>
        <%
}
%>
</body>
</html>