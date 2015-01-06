<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Mission</title>
</head>
<body>
<b>
    <center>Create new Mission</center>
</b>

<b>Enter Title</b>
<form method="post" action="">
    <textarea name="comments" cols="25" rows="5">
Enter missions title here...
    </textarea><br>
</form>

<div align="right">
    <form action="">
        Starting Day:<br>
        <input type="date" name="bday" max=""><br><br>
        Ending Day:<br>
        <input type="date" name="bday" min=""><br><br>
    </form>
</div>

<b>Enter Description</b>
<form method="post" action="">
    <textarea name="comments" cols="45" rows="5">
Enter description here...
    </textarea><br>
</form>

<div align="right">
    <form>
        Mission Score:
        <input type="number" name="quantity" min="" max="">
    </form>
    <input type="submit" value="Submit"/>
</div>

<form method="post" action="">
    <br><input type="checkbox" name=agent value=""> Agent Mission </br>
    <br><input type="checkbox" name=public value=""> Public Mission </br>
</form>

</body>
</html>
