package Creational.Prototype.v3;

public class Student {
    private String name;

    Student copy() {
        Student s = new Student();
        s.name = this.name;
        return s;
    }
}
