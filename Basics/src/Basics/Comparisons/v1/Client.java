package Basics.Comparisons.v1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // In the last example we have discussed Comparable. So in this example
        // We will discuss Comparators and their usage
        // A comparator defines an external comparison strategy which can be used to compare a single class in multiple ways unlike Comparable
        Human human1 = new Human("Tanuj", 32);
        Human human2 = new Human("Tj", 27);
        List<Human> humans = new ArrayList<>(List.of(human1, human2));
        humans.sort(Human.COMPARE_BY_NAME); // Passing comparator to List.sort (similar to Collections.sort(list_name, Comparator<> c)
        System.out.println("======== Sorting Humans by Name ========");
        for (Human human : humans) {
            System.out.println(human.getName() + " " + human.getAge());
        }
        // Now we will sort it via age
        humans.sort(Human.COMPARE_BY_AGE);
        System.out.println("======== Sorting Humans by Age ========");
        for (Human human : humans) {
            System.out.println(human.getName() + " " + human.getAge());
        }
        // We can see how flexible it is to use Comparator and how we can compare multiple objects easily.
        // So now we will see how we can do the same thing for Player class, but we will use lambda operators and Comparator.comparing method to do so
        Player player1 = new Player("Tj", 1200);
        Player player2 = new Player("Tj", 1500);
        Player player3 = new Player("Tanuj", 1500);
        Player player4 = new Player("Tanuj", 1800);
        List<Player> players = new ArrayList<>(List.of(player1, player2, player3, player4));
        players.sort(Player.COMPARE_BY_NAME);
        System.out.println("======== Sorting Players by Name ========");
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getRank());
        }
        players.sort(Player.COMPARE_BY_NAME_DESC);
        System.out.println("======== Sorting Players by Name (Desc) ========");
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getRank());
        }
        players.sort(Player.COMPARE_BY_RANK);
        System.out.println("======== Sorting Players by Rank ========");
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getRank());
        }
        players.sort(Player.COMPARE_BY_RANK_DESC);
        System.out.println("======== Sorting Players by Rank (Desc) ========");
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getRank());
        }
        // In the next part of this example we use ESports Player to understand the chaining of comparators
        // We see single and multiple chaining along with reverse ordering
        ESportsPlayer eSportsPlayer1 = new ESportsPlayer("Tj", 27, 1200);
        ESportsPlayer eSportsPlayer2 = new ESportsPlayer("Tj", 27, 1500);
        ESportsPlayer eSportsPlayer3 = new ESportsPlayer("Tj", 32, 1500);
        ESportsPlayer eSportsPlayer4 = new ESportsPlayer("Tj", 32, 3200);
        ESportsPlayer eSportsPlayer5 = new ESportsPlayer("Tanuj", 27, 1500);
        ESportsPlayer eSportsPlayer6 = new ESportsPlayer("Tanuj", 27, 1800);
        ESportsPlayer eSportsPlayer7 = new ESportsPlayer("Tanuj", 32, 1800);
        ESportsPlayer eSportsPlayer8 = new ESportsPlayer("Tanuj", 32, 3200);
        List<ESportsPlayer> eSportsPlayers = new ArrayList<>
                (List.of(eSportsPlayer1, eSportsPlayer2, eSportsPlayer3, eSportsPlayer4, eSportsPlayer5, eSportsPlayer6, eSportsPlayer7, eSportsPlayer8));
        eSportsPlayers.sort(ESportsPlayer.COMPARE_BY_NAME);
        System.out.println("======== Sorting ESportsPlayers by Name (increasing) ========");
        for (ESportsPlayer eSportsPlayer : eSportsPlayers) {
            System.out.println(eSportsPlayer.getName() + " " + eSportsPlayer.getAge() + " " + eSportsPlayer.getGlobalRanking());
        }
        eSportsPlayers.sort(ESportsPlayer.COMPARE_BY_RANK_THEN_AGE_DESC);
        System.out.println("======== Sorting ESportsPlayers by Rank (increasing) and Age (decreasing) ========");
        for (ESportsPlayer eSportsPlayer : eSportsPlayers) {
            System.out.println(eSportsPlayer.getName() + " " + eSportsPlayer.getAge() + " " + eSportsPlayer.getGlobalRanking());
        }
        eSportsPlayers.sort(ESportsPlayer.COMPARE_BY_RANK_THEN_NAME_DESC_THEN_AGE_DESC);
        System.out.println("======== Sorting ESportsPlayers by Rank (increasing), Name (decreasing) and Age (decreasing) ========");
        for (ESportsPlayer eSportsPlayer : eSportsPlayers) {
            System.out.println(eSportsPlayer.getName() + " " + eSportsPlayer.getAge() + " " + eSportsPlayer.getGlobalRanking());
        }
        // In this way we can use all the comparators to basically sort the objects according to our needs
    }
}
