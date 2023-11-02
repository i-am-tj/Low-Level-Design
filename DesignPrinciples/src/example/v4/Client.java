package example.v4;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private static Bird sparrow;

    public static void main(String[] args) {
        List<FlyableBird> flyableBirds =  new ArrayList<>();
        flyableBirds.add(new Sparrow()); // Possible as flyablebird imterface is implemented
        //flyableBirds.add(new Peacock()); -> can't implement this as there is no flyable interface implemented
        Bird sparrow = new Sparrow();
        sparrow.setName("Sparrow");
        sparrow.setType(BirdType.SPARROW);
        sparrow.setAge(5);
        sparrow.setColor("GREEN");
        sparrow.makeSound();
        ((Sparrow) sparrow).fly();
        flyableBirds.add((FlyableBird) sparrow); // Needs a type caste because Bird sparrow has been created
    }
}
