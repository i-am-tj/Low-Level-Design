package example.v3;

public class Sparrow extends Bird implements FlyableBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flies low");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow makes sounds");
    }
}
