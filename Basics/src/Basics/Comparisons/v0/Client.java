package Basics.Comparisons.v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // In Java there are 2 ways to compare any object
        // 1. Comparable - Uses a compareTo(T t) method and is used when natural ordering is expected
        // 2. Comparator - Uses a compare(T o1, T o2) which defines multiple ways of ordering
        // In this example we will first see comparable and then extend the same to comparator to discuss further
        // So in Comparable the class has to implements Comparable and override compareTo method in order to specify the ordering
        // Now we will also understand what natural ordering means using 2 classes and 2 different types of Comparable (1 with String and other with number)
        // 1. Using Natural Ordering of Strings
        Human human1 = new Human("Tj", 27);
        Human human2 = new Human("Tanuj", 32);
        List<Human> humans = new ArrayList<>(List.of(human1, human2));
        Collections.sort(humans); // We won't be able to do it if class doesn't implement Comparable (Try removing implements part)
        System.out.println("======== Sorting Humans by Name ========");
        for (Human human : humans) {
            System.out.println(human.getName() + " " + human.getAge());
        }
        // 2. Using Natural Ordering of Integer
        Player player1 = new Player("Tj", 1500);
        Player player2 = new Player("Tanuj", 4500);
        List<Player> players = new ArrayList<>(List.of(player1, player2));
        Collections.sort(players);
        System.out.println("======== Sorting Players by Rank ========");
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getRank());
        }
        // Now with comparable we cannot use multiple types of ordering for a single class.
        // But we can definitely apply multiple conditions in order to sort the objects
        // Let us sort a list of ESports players by their rank and if their rank is equal sort by their name
        // and if names are also same sort by the decreasing order of age
        ESportsPlayer eSportsPlayer1 = new ESportsPlayer("Tj", 27, 1200);
        ESportsPlayer eSportsPlayer2 = new ESportsPlayer("Tj", 27, 1500);
        ESportsPlayer eSportsPlayer3 = new ESportsPlayer("Tanuj", 27, 1500);
        ESportsPlayer eSportsPlayer4 = new ESportsPlayer("Tanuj", 32, 1500);
        List<ESportsPlayer> eSportsPlayers = new ArrayList<>(List.of(eSportsPlayer1, eSportsPlayer2, eSportsPlayer3, eSportsPlayer4));
        Collections.sort(eSportsPlayers);
        System.out.println("======== Sorting ESportsPlayers by Rank (increasing), Name (increasing) and Age (decreasing) ========");
        for (ESportsPlayer eSportsPlayer : eSportsPlayers) {
            System.out.println(eSportsPlayer.getName() + " " + eSportsPlayer.getAge() + " " + eSportsPlayer.getGlobalRanking());
        }
        // Since we have seen Comparable in all possible way, now we will move towards Comparator in the next example
    }
}
