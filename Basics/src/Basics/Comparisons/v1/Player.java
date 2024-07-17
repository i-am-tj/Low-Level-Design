package Basics.Comparisons.v1;

import java.util.Comparator;

public class Player {
    private String name;
    private int rank;
    public Player(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    // Comparators
    public static final Comparator<Player> COMPARE_BY_NAME = (p1, p2) -> p1.getName().compareTo(p2.getName());
    public static final Comparator<Player> COMPARE_BY_NAME_DESC = (p1, p2) -> p2.getName().compareTo(p1.getName());

    public static final Comparator<Player> COMPARE_BY_RANK = Comparator.comparing(Player::getRank);
    public static final Comparator<Player> COMPARE_BY_RANK_DESC = Comparator.comparing(Player::getRank).reversed();
}
