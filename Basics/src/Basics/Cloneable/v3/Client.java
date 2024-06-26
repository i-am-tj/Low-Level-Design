package Basics.Cloneable.v3;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // In this example we will understand effect of Cloneable on subtypes (child classes)
        // Cloneable is propagated automatically to the child classes and hence all the child classes are cloneable

        ESportsPlayer eSportsPlayer = new ESportsPlayer("knight", "king123", 2500);
        CricketPlayer cricketPlayer = new CricketPlayer("Tj", "tj123", 4000);

        // Cloning the esports player directly
        ESportsPlayer eSportsPlayer1 = (ESportsPlayer) eSportsPlayer.clone();
        eSportsPlayer.display();
        eSportsPlayer1.display();

        // We can see ESportsPlayer has implemented Cloneable without adding any implements keyword in the class file
        // Now for the Cricket player class, it opted out from getting and hence it is expected to throw an Exception
        CricketPlayer cricketPlayer1 = (CricketPlayer) cricketPlayer.clone(); // Exception in thread "main" java.lang.CloneNotSupportedException: This class is not cloneable

        // With this we complete the understanding of Cloneable


    }
}
