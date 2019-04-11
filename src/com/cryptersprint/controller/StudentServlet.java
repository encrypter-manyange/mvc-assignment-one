package com.cryptersprint.controller;

import com.cryptersprint.data.StudentRecord;
import com.cryptersprint.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "StudentServlet",urlPatterns = "/addStudent")

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String fullname = request.getParameter("fullname");
        String regnum = request.getParameter("regnum");
        String faculty = request.getParameter("faculty");
        String program = request.getParameter("program");
        Student student =  new Student(fullname,regnum,faculty,program);
        StudentRecord.studentList.add(student);
        request.setAttribute("student_list",StudentRecord.studentList);
        RequestDispatcher view = request.getRequestDispatcher("view_students.jsp");
        view.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("student_list",StudentRecord.studentList);
        RequestDispatcher view = request.getRequestDispatcher("view_students.jsp");
        view.forward(request,response);

    }
}
