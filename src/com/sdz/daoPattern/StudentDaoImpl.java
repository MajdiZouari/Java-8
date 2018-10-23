package com.sdz.daoPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    //list is working as a database
    List<StudentModel> students;

    public StudentDaoImpl(){
        students = new ArrayList<StudentModel>();
        StudentModel student1 = new StudentModel("Robert",0);
        StudentModel student2 = new StudentModel("John",1);
        students.add(student1);
        students.add(student2);
    }
    @Override
    public void deleteStudent(StudentModel student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    //retrive list of students from the database
    @Override
    public List<StudentModel> getAllStudents() {
        return students;
    }

    @Override
    public StudentModel getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(StudentModel student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }
}