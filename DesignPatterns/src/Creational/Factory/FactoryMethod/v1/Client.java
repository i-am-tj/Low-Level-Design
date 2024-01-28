package Creational.Factory.FactoryMethod.v1;

public class Client {
    public static void main(String[] args) {
        // With the earlier problem in mind, we can actually tackle the problem
        // by just creating the bird in the season class itself rather than overcomplicating
        // Bird class.
        // NOTE: We make the method abstract, so that implementation is in subclasses become necessary
        Bird b = new Summer().getBirdOfSeason();

        // Often when implementing an interface / inheritance relation, we also create
        // a relation to another inheritance.
        // When you want to map a specific type of one class to a specific type of
        // another class that is known as
        // Factory Method Design Pattern

        // This getBirdOfSeason is basically implementing Factory Method Pattern
    }
}
