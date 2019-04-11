package com.cryptersprint.data;

import com.cryptersprint.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord {
    public static List<Student> studentList = new ArrayList<>();
     static{

        studentList.add(new Student("Encrypter Manyange","R158673A","Commerce","HBSCT"));
    }
}
