package example.v1;

public class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flies low");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow makes sounds");
    }
}
