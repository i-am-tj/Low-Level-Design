package Basics.Final.v0;

public class Client {
    public static void main(String[] args) {
        // Create a class with final instance variable as input
        FinalClass finalClass = new FinalClass(20);
        FinalClass finalClass1 = new FinalClass(30, 40);

        int key = finalClass.getKey();
        int val = finalClass.getValue();

        System.out.println(key + " " + val);

        int key1 = finalClass1.getKey();
        int val1 = finalClass1.getValue();

//        finalClass1.key = 35; // not allowed since the variable is defined final
//        finalClass1.value = 45; // not allowed since the variable is declared final and instantiated via constructor

        System.out.println(key1 + " " + val1);

        // In this example we have only seen final variable (both defined and declared) and use cases.
        // In the further examples we will see how final methods and classes can be created and what are the limitations with those in inheritance

    }
}
