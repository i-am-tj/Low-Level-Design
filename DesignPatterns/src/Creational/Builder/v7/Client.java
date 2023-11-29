package Creational.Builder.v7;

public class Client {
    public static void main(String[] args) throws Exception {
        // Final Builder Pattern code.
        Student s = Student.getBuilder().setName("Tanuj").setAge(26).build();

        // Student sz = new Student(null); --> Now this is not possible

        // This is how we create a Builder pattern.
        // Things to note :
        // 1. Constructor of student class was made private so that no one else could access it.
        // 2. But then Builder class build() method could not access the new Student().
        // 3. So, the whole Builder class was shifted to Student class as inner class.
        // 4. Now the getBuilder being a static method was not able to call new Builder() as it was calling non-static this from static context within a class
        // 5. Hence, there were two options - make getBuilder() non-static or make Builder class static.
        // 6. If we make getBuilder() non-static then we wouldn't be able to create the object using Student.getBuilder()
        // 7. Thus, we moved ahead with making the Builder class static.

        // This commences the Builder design pattern understanding

    }
}
