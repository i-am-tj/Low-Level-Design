package Creational.Builder.v3;

public class Client {
    public static void main(String[] args) throws Exception {
        // In this version, we are using telescoping constructors.
        Student s1 = new Student("Tanuj", 26, 87.4, "Oct-23", 'M');

        // Problems with this approach -
        // 1. 2 problems from v2 still remain.
        // 2. Which constructor to even call? Since there are again so many constructors.

        // So, we need to think of a better solution. Then, what are the things we need to work upon?
        // 1. Solution should have ideally 1 constructor.
        // 2. Readability should not be an issue.

    }
}
