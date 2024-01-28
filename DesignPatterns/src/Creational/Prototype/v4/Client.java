package Creational.Prototype.v4;

public class Client {
    public static void main(String[] args) {
        // In this approach we create a copy constructor in the child class
        // And the child class copy method calls the copy constructor of the same class
        // So in this way all the checks and violations are being taken care of
        Student student1 = new IntelligentStudent();
        System.out.println(student1.toString());
        Student student2 = student1.copy();

        // Why Prototype?
        // 1. Avoid modification to original object
        // 2. For commonly needed objects, we store a prototype
        // of them which has base values set and whenever there is
        // a requirement of that we create a copy from prototype


    }
}
