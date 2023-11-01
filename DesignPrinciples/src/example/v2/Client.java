package example.v2;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.setName("Sparrow");
        sparrow.setType(BirdType.SPARROW);
        sparrow.setAge(5);
        sparrow.setColor("GREEN");
        sparrow.makeSound();
    }
}
