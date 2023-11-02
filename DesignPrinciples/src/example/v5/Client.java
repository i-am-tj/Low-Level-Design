package example.v5;

public class Client {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow(new SlowFlyingBehaviour());
        sparrow.setName("Sparrow");
        sparrow.setType(BirdType.SPARROW);
        sparrow.setAge(5);
        sparrow.setColor("GREEN");
        sparrow.makeSound();
        sparrow.fly();

        Eagle eagle = new Eagle(new FastFlyingBehaviour());
        eagle.fly();
    }


}
