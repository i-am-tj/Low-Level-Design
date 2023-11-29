package Creational.Builder.v2;

public class Student {
    private String name;
    private int age;
    private double psp;

    private String batch;

    private String universityName;
    private char gender;
    public Student() {}

    public Student(String name, int age) throws Exception {
        //validations
        if(name == null || age < 25) {
            throw new Exception("Name not provided");
        }
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double psp) throws Exception {
        //validations
        if(name == null || age < 25) {
            throw new Exception("Name not provided");
        }
        if(age > 25 && psp < 90.0) {
            throw new Exception("Student needs to be looked after");
        }
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public Student(String name, int age, double psp, String batch, char gender) throws Exception {
        //validations
        if(name == null || age < 25) {
            throw new Exception("Name not provided");
        }
        if(age > 25 && psp < 90.0) {
            throw new Exception("Student needs to be looked after");
        }
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batch = batch;
        this.gender = gender;
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
