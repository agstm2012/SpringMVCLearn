<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
    <script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <ul class="nav nav-list">
                <li class="nav-header">Services</li>
                <li class="active"><a href="#">New Restaurant</a></li>
                <li class="active"><a href="/newCity">New City</a></li>
                <li class="active"><a href="/newDistance">New Distance</a></li>
            </ul>
        </div>
        <div class="span10">
            <form class="form-horizontal" method="post" action="/createdoc">
                <fieldset>
                    <legend>New Doctor</legend>
                    <label>Name</label>
                    <input type="text" name="name" placeholder="">
                    <label>Address</label>
                    <input type="text" name="address" placeholder="">
                    <div class="control-group" style="padding-top:20px">
                        <button type="submit" class="btn">Submit</button>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>

</body>
</html>