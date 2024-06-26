package Basics.Final.v1;

public class Client {
    public static void main(String[] args) {
        Human human = new Human("Tanuj", 27);

        // As earlier, we cannot set the final member values explicitly
        human.display();
        human.display("80"); //overloaded method

        // Subclass of type Human
        human = new Player("Tj", 27, "5'7", "67");
        human.display(); // only contains name and age and since the type of player is human

        // Subclass of type Player
        Player player = new Player("Tj", 27, "5'7", "67");
        player.display();
        player.displayPlayer();

        // We can also instantiate another object if we want to change the class variables
        player = new Player("Tj", 28, "5'7", "65");
        player.display();
        player.displayPlayer();

        // In this example we have seen the use of both object members and methods as final
        // TLDR - final methods cannot be overridden
        // In the next example we will see final classes
    }
}
