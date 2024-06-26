package Basics.Final.v2;

public class Client {
    public static void main(String[] args) {
        // In this example human class is final
        // This restricts the Player class to extend Human (as subclassing of final class is prohibited)
        // While final class does not restrict the number of copies of the class that can be created
        // Hence we can still create multiple instances of the class
        Human human1 = new Human("Tanuj", 27);
        human1.display();

        Human human2 = new Human("Tj", 27, "67");
        human2.displayAll();
        human2.setWeight("65"); // We can also access and change the data members
        human2.displayAll();

        // Get the "identity" hash codes
        int identityHashCode1 = System.identityHashCode(human1);
        int identityHashCode2 = System.identityHashCode(human2);
        System.out.println(identityHashCode1 + " " + identityHashCode2);

        // Even though the class was final you can see we could create multiple instances of the class
        // As well modify the values of the class
        // Also we could see the 2 different instances created

        // Usually final classes are created to ensure immutability. Hence, in next example we will see how to ensure this


    }
}
