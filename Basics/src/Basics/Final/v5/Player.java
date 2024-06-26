package Basics.Final.v5;

public class Player {
    private String name;
    private int ranking;

    public Player(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    public void display() {
        System.out.println("Player - Name: " + getName() + " Ranking: " + getRanking());
    }
}
