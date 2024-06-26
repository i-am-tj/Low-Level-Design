package Basics.Final.v1;

public class Human {

    private final String name;
    private final int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Since the method is final it cannot be overridden but can be overloaded
    final void display() {
        System.out.println("Human - Name: " + this.getName() + " Age: " + this.getAge());
    }

    //Overloaded display method
    final void display(String weight) {
        System.out.println("Human - Name: " + this.getName() + " Age: " + this.getAge() + " Weight: " + weight);
    }

}
