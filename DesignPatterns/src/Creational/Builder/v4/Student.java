package Creational.Builder.v4;

import java.util.Map;

public class Student {
    private String name;
    private int age;
    private double psp;

    private String batch;

    private String universityName;
    private char gender;


    public Student(Map<String, Object> args) {
        String name = (String) args.get("name");
        int age = (int) args.get("age");
        double psp = (double) args.get("psp");

        //validations
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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
