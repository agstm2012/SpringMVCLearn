<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 12.06.2014
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="span10">
    <form:form class="form-horizontal" method="post" action="createDistance" commandName="distance">
        <label>From city</label>
        <form:select path="fromCity" id="id" items="${cityList}"/>
        <label>To city</label>
        <form:select path="toCity" id="id" items="${cityList}"/>
        <div class="control-group" style="padding-top:20px">
            <input type="submit" class="btn">
        </div>
    </form:form>
</div>
</body>
</html>