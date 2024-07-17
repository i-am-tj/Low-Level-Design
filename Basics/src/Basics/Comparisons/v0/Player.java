package Basics.Comparisons.v0;

public class Player implements Comparable<Player> {
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

    @Override
    public int compareTo(Player p) {
        return Integer.compare(this.getRank(), p.getRank()); // Similar to Integer.valueOf(this.getRank()).compareTo(Integer.valueOf(p.getRank()))
    }
}
