<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Mission</title>
</head>
<body>
<b>
    <center>Create new Mission</center>
</b>

<b>Enter Title</b><br>

<form action="savemission.jsp" id="usrform" method="post">
    <textarea rows="4" cols="50" name="tle" form="usrform">
Enter text here...</textarea>


    <div align="right">
        Starting Day:<br>
        <input type="date" name="sbday" max=""><br>
        Ending Day:<br>
        <input type="date" name="fbday" min=""><br>
    </div>


<b>Enter Description</b><br>
    <textarea rows="4" cols="50" name="desc" form="usrform">
Enter description here...</textarea><br>


<div align="right">
Mission Score: <input type="number" name="quantity" min="" max="">
</div>
<input type="submit">
</form>

<!--<form method="post" action="savemission.jsp">
    <br><input type="checkbox" name=agent value=""> Agent Mission </br>
    <br><input type="checkbox" name=public value=""> Public Mission </br>
</form> -->

</body>
</html>