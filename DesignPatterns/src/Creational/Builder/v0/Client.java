package Creational.Builder.v0;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tanuj");
        s.setAge(26);
        // Similarly we set other attributes

        // Now in this scenario suppose we want to validate that if age > 26 then psp should be > 90.
        // But then how do validate. Where do you add the code?
        // But you can't use setters to validate if the other value is not yet set.
        // Hence, it won't work for 2 cases:
        // 1. won't be able to handle where there are multiple attributes involved in validation
        // 2. class is immutable (once object of class is created, shouldn't be modified)
        // So the only solution that comes to mind now is using constructor.
        // Hence, we move to v1 solution.
    }
}
