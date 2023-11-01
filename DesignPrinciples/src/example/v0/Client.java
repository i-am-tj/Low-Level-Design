package example.v0;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.setName("Sparrow");
        sparrow.setType(BirdType.SPARROW);
        sparrow.setAge(5);
        sparrow.setColor("GREEN");
        sparrow.fly();
    }
}
