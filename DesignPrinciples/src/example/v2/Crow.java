package example.v2;

public class Crow extends FlyableBird {

    @Override
    public void fly() {
        System.out.println("Crow flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Crow makes sound");
    }
}
