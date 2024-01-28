package Creational.Prototype.v0;

public class Client {
    public static void main(String[] args) {
        // We want to create a copy of the same student class
        Student student1 = new Student();
        // So to create a copy of the class we can use a copy constructor
        Student student2 = new Student(student1);
        // This can be one approach, but there can be another approach as well
        // Note: There can be another violation of OCP if there is a different type of Student
    }
}
