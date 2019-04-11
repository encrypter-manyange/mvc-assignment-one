package com.cryptersprint.model;

public class Student {

    private String fullname;
    private String regnum;
    private String faculty;
    private String program;

    public Student(String fullname, String regnum, String faculty, String program) {

        this.fullname = fullname;
        this.regnum = regnum;
        this.faculty = faculty;
        this.program = program;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +

                ", fullname='" + fullname + '\'' +
                ", regnum='" + regnum + '\'' +
                ", faculty='" + faculty + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
