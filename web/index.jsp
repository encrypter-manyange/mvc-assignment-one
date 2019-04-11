<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
  </head>
  <body>

  <br>
  <form action="/addStudent" class="container" method="post">
      <a href="/addStudent" class="btn btn-success btn-sm pull-right">View Students</a>

      <br>
      <h2 class="text text-center text-capitalize text-primary">Create a Student</h2>
      <br>
    <div class="row">
      <div class="col-md-12">
        <input type="text" name="fullname" placeholder="Fullname" class="form-control" required>
      </div>
    </div><br>
    <div class="row">
      <div class="col-md-12">
        <input type="text" name="regnum"  placeholder="Registration Number" class="form-control" required>
      </div>
    </div><br>
    <div class="row">
      <div class="col-md-12">
        <input type="text" name="faculty"  placeholder="faculty of Study" class="form-control" required>
      </div>
    </div><br>
    <div class="row">
      <div class="col-md-12">
        <input type="text" name="program" placeholder="Program" class="form-control" required>
      </div>
    </div><br>
    <div class="row">
      <div class="col-md-12">
        <input type="submit" value="Add Student" class="btn btn-primary btn-block btn-sm">
      </div>
    </div>
  </form>
  </body>
</html>