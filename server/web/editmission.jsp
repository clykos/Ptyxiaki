<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Mission</title>
</head>
<body>
<b>
    <center>Edit Mission</center>
</b>

<form method="post" action="">
    <br><input type="checkbox" name=agent value=""> Agent Mission </br>
    <br><input type="checkbox" name=public value=""> Public Mission </br>
</form>

<div align="right">
    <form action="">
        Starting Day:<br>
        <input type="date" name="bday" max=""><br><br>
        Ending Day:<br>
        <input type="date" name="bday" min=""><br><br>
    </form>
</div>

<div align="right">
    <form>
        Mission Score:
        <input type="number" name="quantity" min="" max="">
    </form>
    <input type="submit" value="Submit"/>
</div>



</body>
</html>
