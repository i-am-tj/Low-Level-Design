package Creational.Prototype.v1;

public class Client {
    public static void main(String[] args) {
        // Another approach can be such that it provides copy of attributes
        // one by one.
        Student student1 = new Student();
        student1.name = "Tanuj";

        Student student2 = new Student();
        student2.name = student1.name;

        // Problems with this solution -
        // 1. If the student class has private attributes, then we won't be able to copy it.
        // 2. Implementation details is exposed - Tight coupling
        // 3. If student1 was an object of a child class and not Student, then there could be an issue.

    }
}
