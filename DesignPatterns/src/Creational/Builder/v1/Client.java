package Creational.Builder.v1;

public class Client {
    public static void main(String[] args) throws Exception {
        // In this version, we are using validations via constructor.
        Student s = new Student("Tanuj", 26, 87.4, "Oct-23", 'M');

        // Problems with this approach -
        // 1. Client is going to have difficulty in creating objects / Not easily understandable code
        // 2. It is very much prone to errors as IDE won't give any compile time error
        // 3. We haven't actually validated before the object was created. --> Minor problem

        // Now suppose there are more attributes and client doesn't want to pass all the attributes at the beginning.
        // So we might end up writing a code like

        Student sz = new Student(null, 26, 94.8, null, 'M');

        // In this case we can see there are a lot of nulls in the constructor.
        // So, then we need multiple constructors here. Hence, we go for v2.

    }
}
