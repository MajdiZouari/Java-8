package com.sdz.daoPattern;
/**
 * Created by MZouari on 18/01/2019.
 */
public class StudentModel {
    private String name;
    private int rollNo;

    StudentModel(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
