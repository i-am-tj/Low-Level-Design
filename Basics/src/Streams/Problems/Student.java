package Streams.Problems;

import java.util.Map;

public class Student {
    private int id;
    private String name;
    private int age;
    private double cgpa;
    private Map<Subject, Integer> marks;

    public Student(int id, String name, int age, double cgpa, Map<Subject, Integer> marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.marks = marks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Map<Subject, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Subject, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + " Age: " + age + " CGPA: " + cgpa;
    }
}
