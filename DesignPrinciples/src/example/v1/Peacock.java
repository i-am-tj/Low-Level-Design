package example.v1;

public class Peacock extends Bird {
    @Override
    public void fly() {
        System.out.println("Peacock doesn't fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Peacock does sounds while dancing");
    }
}
