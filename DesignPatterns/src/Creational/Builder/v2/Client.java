package Creational.Builder.v2;

public class Client {
    public static void main(String[] args) throws Exception {
        // In this version, we are using multiple constructors for validation. (Constructor overloading)
        Student s1 = new Student("Tanuj", 26, 87.4, "Oct-23", 'M');

        // Problems with this approach -
        // 1. Too many constructors - if there are n attributes, then 2^n constructors - Constructor explosion
        // 2. Might have compilation errors - 2 constructors with same method signature
        // 3. Repeated code (Violates DRY) -- > How to avoid? --> Telescoping constructors

        // Just to avoid 3rd problem we will understand the concept of telescoping constructors.
        // Hence, we move to v3.

    }
}
