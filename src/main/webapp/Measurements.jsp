<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Measurements taking</title>
</head>
<body>
<h2>Wprowadź wymiary</h2>
<form method="post" action="measurements">
    <c:out>Login</c:out> <input type="text" name="name"/> <br>
    <c:out>Data</c:out> <input type="text" name="date"/> <br>
    <c:out>Wzrost</c:out> <input type="text" name="height"/> <br>
    <c:out>Obwód klatki piersiowej</c:out> <input type="text" name="bust"/> <br>
    <c:out>Obwód pod biustem</c:out> <input type="text" name="underBust"/> <br>
    <c:out>Obwód talii</c:out> <input type="text" name="waistLowest"/> <br>
    <c:out>Obwód brzucha (możliwie największy)</c:out> <input type="text" name="waistLargest"/> <br>
    <c:out>Obwód brzucha nad biodrami</c:out> <input type="text" name="waistAboveHips"/> <br>
    <c:out>Obwód bioder</c:out> <input type="text" name="hips"/> <br>
    <c:out>Obwód uda (możliwie największy)</c:out> <input type="text" name="thighLargest"/> <br>
    <c:out>Obwód uda (w połowie)</c:out> <input type="text" name="thigh"/> <br>
    <c:out>Obwód uda (nad kolanem)</c:out> <input type="text" name="thighLowest"/> <br>
    <c:out>Obwód pod kolanem</c:out> <input type="text" name="calfBelowKnee"/> <br>
    <c:out>Obwód łydki</c:out> <input type="text" name="calf"/> <br>
    <c:out>Obwód kostki</c:out> <input type="text" name="ankle"/> <br>
    <c:out>Obwód ramienia (przy barku)</c:out> <input type="text" name="armByShoulder"/> <br>
    <c:out>Obwód ramienia</c:out> <input type="text" name="arm"/> <br>
    <c:out>Obwód nadgarstka</c:out> <input type="text" name="wrist"/> <br>
    <input type="submit" name="ok"/>

</body>
</html>
