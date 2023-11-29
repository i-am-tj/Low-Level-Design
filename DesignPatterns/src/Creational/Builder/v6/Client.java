package Creational.Builder.v6;

public class Client {
    public static void main(String[] args) throws Exception {
        // Towards Final Builder Pattern code.
        Student s = Student.getBuilder().setName("Tanuj").setAge(26).build();

        // So, we have almost implemented the final solution of Builder, but there still one edge case that needs to be taken care
        // Suppose, we create something like this

        Student sz = new Student(null);

        // We are still able to create a student by passing null object to builder.
        // Should we not restrict this scenario?
        // So there should not be any other way to create an object of Student directly.
        // Hence, we see the final solution - v7

    }
}
