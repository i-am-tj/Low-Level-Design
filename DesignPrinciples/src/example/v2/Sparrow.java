package example.v2;

public class Sparrow extends FlyableBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flies low");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow makes sounds");
    }
}
