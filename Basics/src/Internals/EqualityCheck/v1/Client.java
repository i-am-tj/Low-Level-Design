package Internals.EqualityCheck.v1;

public class Client {
    public static void main(String[] args) {
        // In this example we will see the use of equals() and also how hashCode() gets complemented by it
        // equals() checks for content parity simply and not the reference
        // equals() is not applicable to primitive data types
        // equals() with non-primitive data types
        // Strings
        System.out.println("-------------------------------------------------------------");
        System.out.println("equals() with non-primitive data types (Strings)");
        String s1 = "Tanuj";
        String s2 = s1;
        String s3 = new String("Tanuj");
        String s4 = "Tj";
        System.out.println((s1.equals(s2)) ? "s1 and s2 are same element" : "s1 and s2 are different element");
        System.out.println((s1.equals(s3)) ? "s1 and s3 are same element" : "s1 and s3 are different element");
        System.out.println((s1.equals(s4)) ? "s1 and s4 are same element" : "s1 and s4 are different element");
        // Here we can see both s1 and s2 and s2 and s3 are same element as equals() checks for values and not references.
        // Now what if we change value in s2 and also create a new variable s5
        s2 = "Tj";
        String s5 = new String("Tj");
        System.out.println("After change");
        System.out.println((s1.equals(s2)) ? "s1 and s2 are same element" : "s1 and s2 are different element");
        System.out.println((s2.equals(s4)) ? "s2 and s4 are same element" : "s2 and s4 are different element");
        System.out.println((s2.equals(s5)) ? "s2 and s5 are same element" : "s2 and s5 are different element");
        System.out.println("-------------------------------------------------------------");
        System.out.println("equals() with Objects");
        Human human1 = new Human("Tanuj", 27);
        Human human2 = new Human("Tanuj", 27);
        // Here if we run it we will see the output as false
        // Please comment equals() in Human class to see the output
        // System.out.println((human1.equals(human2)) ? "Human1 and Human2 are same element" : "Human1 and Human2 are different element");
        // Here we had said equals() checks for content but why did this happen then?
        // Because of the equals implementation in Object class which looks like
        // public boolean equals(Object obj) {
        //    return (this == obj);
        // }
        // This hence is basically checking for referential equality in the Object class
        // Also some properties of equals()
        // Reflexive: For any non-null reference value x, x.equals(x) should return true.
        // Symmetric: For any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
        // Transitive: For any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
        // Consistent: For any non-null reference values x and y, multiple invocations of x.equals(y) should consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
        // Non-null: For any non-null reference value x, x.equals(null) should return false.
        // Now this implementation is propagated by default to all classes
        // Hence we can override it in Human class
        // Now if we run it
        System.out.println((human1.equals(human2)) ? "Human1 and Human2 are same element" : "Human1 and Human2 are different element");
        // Voila! We see it returns as same element as we are checking each and every field
        // Now understand the concept of hashcode() here
        // Similar to equals(), hashCode() is also an implementation in Object class which gets propagated by default
        // Internal implementation looks like
        // public int hashCode() {
        //    return nativeHashCode();
        // }
        // Though for different objects as well there can be same hashCode() generated and hence this is known as hash collision.
        // But whenever an object implements equals(), hashCode() is also overridden as there is a valid contract between equals() and hashCode() to pass the same hash code for both objects
        // Hence we can override the hashCode() in Human class and check for equality here
        System.out.println((human1.hashCode() == human2.hashCode()) ? "Human1 and Human2 have same hashCode()" : "Human1 and Human2 have different hashCode()");
        // Now if we create a different Human instance with different values, we can see the change
        Human human3 = new Human("Tj", 27);
        System.out.println((human1.hashCode() == human3.hashCode()) ? "Human1 and Human3 have same hashCode()" : "Human1 and Human3 have different hashCode()");
        System.out.println("-------------------------------------------------------------");

        // So in this example we have seen how equals and hashCode() complement each other
        // In the next example we will see to use in built and custom comparators

    }
}
