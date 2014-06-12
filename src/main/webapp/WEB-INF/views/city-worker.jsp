<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 07.06.2014
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>City worker</h1>
<div class="span10">
    <form class="form-horizontal" method="post" action="/createCity">
        <fieldset>
            <legend>New City</legend>
            <label>Name</label>
            <input type="text" name="name" placeholder="">
            <label>Latitude</label>
            <input type="text" name="latitude" placeholder="">
            <label>Longitude</label>
            <input type="text" name="longitude" placeholder="">
            <div class="control-group" style="padding-top:20px">
                <button type="submit" class="btn">Submit</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
