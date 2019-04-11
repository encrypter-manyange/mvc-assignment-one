<%@ page import="java.util.List" %>
<%@ page import="com.cryptersprint.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: witne
  Date: 4/10/2019
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
<br>
<div class="container">
    <br>
    <h1 class="text text-primary text-capitalize text-center">Current Students List</h1>
    <br>
    <table class="table table-hover table-striped">
        <tr>
            <th>Fullname</th>
            <th>Registration Number</th>
            <th>Program</th>
            <th>Faculty</th>
        </tr>
        <%List<Student> students = (List<Student>) request.getAttribute("student_list");%>
        <% for(Student student:students){ %>
            <tr>
                <td><%=student.getFullname() %></td>
                <td><%=student.getRegnum() %></td>
                <td><%=student.getProgram() %></td>
                <td><%=student.getFaculty() %></td>
            </tr>
        <% }%>
    </table>
    <a href="/" class="btn btn-success btn-sm pull-right">Add Students</a>
</div>

</body>
</html>
