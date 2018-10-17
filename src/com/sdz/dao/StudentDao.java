package com.sdz.dao;

import java.util.List;

public interface StudentDao {
    public List<StudentModel> getAllStudents();
    public StudentModel getStudent(int rollNo);
    public void updateStudent(StudentModel student);
    public void deleteStudent(StudentModel student);
}