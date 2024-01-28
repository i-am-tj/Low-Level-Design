package Creational.Prototype.v2;

public class Client {
    public static void main(String[] args) {
        // Now there can be a scenario, where student1 is a type of Intelligent Student
        Student student1 = new IntelligentStudent();
        student1.name = "Tanuj";

        Student student2;
        if(student1 instanceof IntelligentStudent) {
            student2 = new IntelligentStudent();
            student2.name = student1.name;
            // student2.iq = student1.iq; -> This statement won't work without typecasting. Hence this is also a bad solution.
        } else if (student1 instanceof Student) {
            student2 = new Student();
            student2.name = student1.name;
        }

        // This violates both SRP and OCP

    }
}
