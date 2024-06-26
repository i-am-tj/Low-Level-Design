package Internals.EqualityCheck.v0;

public class Client {
    public static void main(String[] args) {
        // In Java, there are a lot of ways to check for equality
        // In this version we will check for the basic '==' operator and understand it's internals

        // '==' operator checks for content value for primitive data type directly as they are available on Stack
        // '==' with primitive data types
        System.out.println("-------------------------------------------------------------");
        System.out.println("'==' with primitive data types");
        int key1 = 10;
        int key2 = 10;
        int key3 = 20;
        System.out.println((key1 == key2) ? "Same element" : "Different element");
        System.out.println((key2 == key3) ? "Same element" : "Different element");
        System.out.println("-------------------------------------------------------------");
        // '==' with non-primitive data types
        // Strings
        System.out.println("'==' with non-primitive data types (Strings)");
        String s1 = "Tanuj";
        String s2 = s1;
        String s3 = new String("Tanuj");
        String s4 = "Tj";
        System.out.println((s1 == s2) ? "s1 and s2 are same element" : "s1 and s2 are different element");
        System.out.println((s1 == s3) ? "s1 and s3 are same element" : "s1 and s3 are different element");
        System.out.println((s1 == s4) ? "s1 and s4 are same element" : "s1 and s4 are different element");
        // Here we can see s1 and s2 are only same. As their reference pointer is similar
        // s1 and s3 though thy have similar value but since the reference is different hence == is not able to classify it as same
        // Now what if we change value in s2.
        s2 = "Tj";
        System.out.println("After change");
        System.out.println((s1 == s2) ? "s1 and s2 are same element" : "s1 and s2 are different element");
        System.out.println((s2 == s4) ? "s2 and s4 are same element" : "s2 and s4 are different element");
        // Now we see something interesting here
        // When s2 was changed a corresponding new reference was created for s2 and hence s1 and s2 are now different elements
        // But we see now s2 and s4 are pointing to the same reference
        // What happened here is know as string interning
        // Which states that there must be only one distinct copy for each string object in the String pool
        // So when was s2 was changed to "Tj". In the string pool there already existed a value for the same
        // Add the heap space got referenced to the same object which holds a reference to this value which was string s4
        // Hence we see the 2 objects being equal

        // Another thing to note here is with the very first example String interning happened for s1 and s3
        // But once we use a new keyword a separate heap space reference is stored for the object
        // But both of them point to the single unique value "Tanuj" from the String pool
        System.out.println("-------------------------------------------------------------");
        System.out.println("'==' with Objects");
        Human human1 = new Human("Tanuj", 27);
        Human human2 = new Human("Tanuj", 27);
        System.out.println((human1 == human2) ? "Human1 and Human2 are same element" : "Human1 and Human2 are different element");
        System.out.println("-------------------------------------------------------------");
        //Even though the 2 objects have same value but since these 2 elements point to different memory address in heap space it recognizes it as different element

        // In the next example we see other operators for equality like hashCode() and equals()
    }
}
