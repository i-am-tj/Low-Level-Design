package Creational.Prototype.v3;

public class Client {
    public static void main(String[] args) {
        // So the best person to create a copy of the class is the class itself.
        // Hence we put a copy() inside the Student class so as any class can copy it using this method;
        Student student1 = new Student();
        Student student2 = student1.copy();

        // Now suppose for any child class if we implement it in similar way
        Student student3 = new IntelligentStudent();
        Student student4 = student3.copy(); // This calls copy constructor of the child class directly because of polymorphism

        // But then now, for all child classes we must override the copy method
        // Also it will not be able to access the private attributes of parent class
        // Hence, we move towards the final solution
    }
}
