package Creational.Prototype.v4;

public class Student {
    private String name;
    public Student() {
        this.name = "Default";
    }
    public Student(Student s) {
        this.name = s.name;
    }

    public Student copy() {
        return new Student(this);
    }
}
