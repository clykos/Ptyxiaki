<%@ page import="webservice.WebService" %>
<%@ page import="beans.UserBean" %>
<%--
  Created by IntelliJ IDEA.
  User: Xristos
  Date: 25/6/2014
  Time: 2:08 μμ
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
<%

    WebService ws=new WebService();
    UserBean answer=ws.createUser("xristos", "admin");
    out.print(answer);

%>
  </body>
</html>
