package example.v1;

public class Crow extends Bird {

    @Override
    public void fly() {
        System.out.println("Crow flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Crow makes sound");
    }
}
