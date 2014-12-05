<html>
<head>
    <title>Administrator Update</title>
</head>
<body>
<b>
    <center>Administrator Update</center>
</b>

<b>Theme</b>
<form method="post" action="">
    <textarea name="comments" cols="25" rows="5">
        Enter theme here...
    </textarea><br>
</form>

<b>Comments</b>
<form method="post" action="">
    <textarea name="comments" cols="45" rows="5">
        Enter your comments here...
    </textarea><br>
</form>

<div align="right">
    <b>Select a photo</b><br>
    <form action="">
        <input type="file" name="pic" accept="image/*"><br>
    </form>
</div>

<b>Choose Significance</b>
<form action="">
    <input type="radio" name="significance" value="None">None
    <input type="radio" name="significance" value="Less">Less
    <input type="radio" name="significance" value="Most">Most
</form>

<form action="">
    <input type="checkbox" name="vehicle" value="Bike">The problem has been fixed<br>
</form>

<input type="submit">
</body>
</html>