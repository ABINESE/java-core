package com.learning.core.Day10;

import java.io.Serializable;

public class StudentData implements Serializable {
    private int rollNumber;
    private String name;
    private int age;
    private String ss;

    public StudentData(int rollNumber, String name, int age, String ss) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.ss = ss;
    }

    
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getSs() { return ss; }
    public void setSs(String ss) { this.ss = ss; }

    @Override
    public String toString() {
        return "StudentData{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ss='" + ss + '\'' +
                '}';
    }
}