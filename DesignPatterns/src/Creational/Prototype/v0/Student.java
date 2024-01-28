package Creational.Prototype.v0;

public class Student {
    String name;
    public Student() {
        this.name = "Default";
    }
    public Student(Student s) {
        this.name = s.name;
    }
}
