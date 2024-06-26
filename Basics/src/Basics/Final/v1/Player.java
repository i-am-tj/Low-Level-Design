package Basics.Final.v1;

public class Player extends Human {

    private final String height;
    private String weight;

    // A constructor with 2 variables - name and age are must as these are final in the superclass
    // Since we introduced height as final this has also become mandatory while weight can be excluded as well from the constructor
    // Or can be included in a different constructor all together
    public Player(String name, int age, String height) {
        super(name, age);
        this.height = height;
    }

    public Player(String name, int age, String height, String weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    // We cannot create a display method here as the super class has a method with the same name, but it is declared as final
    // This is to display the example that method overriding with final methods is not allowed
    void displayPlayer() {
        System.out.println("Player- Name: " + this.getName() + " Age: " + this.getAge() + " Height: " + this.getHeight() + " Weight: " + this.getWeight());
    }

}
