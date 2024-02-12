package models;

public class Player {
    private String name;
    PlayerType playerType;
    int position;

    public Player(String name, PlayerType playerType) {
        this.name = name;
        this.playerType = playerType;
        this.position = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
