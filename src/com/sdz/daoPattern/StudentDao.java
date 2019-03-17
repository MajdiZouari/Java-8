package com.sdz.daoPattern;

import java.util.List;
/**
 * Created by MZouari on 18/01/2019.
 */
public interface StudentDao {
    public List<StudentModel> getAllStudents();
    public StudentModel getStudent(int rollNo);
    public void updateStudent(StudentModel student);
    public void deleteStudent(StudentModel student);
}