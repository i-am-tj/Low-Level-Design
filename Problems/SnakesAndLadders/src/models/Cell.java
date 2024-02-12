package models;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    int row;
    int col;
    private List<Player> players;
    private GameEntity gameEntity;
    CellStatus cellStatus;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellStatus = CellStatus.EMPTY;
        this.players = new ArrayList<>();
    }

    public void display(int pos) {
        if(players.isEmpty()) {
            if(gameEntity == null) {
                System.out.print(pos + " : [  ] : [  ] |");
            } else {
                System.out.print(pos + " : [  ] : [" + gameEntity.name  + "] |");
            }
        } else {
            if(gameEntity == null) {
                System.out.print(pos + " : " + players + " : [  ] |");
            } else {
                System.out.print(pos + " : " + players + " : [" + gameEntity.name  + "] |");
            }

        }
    }

    public GameEntity getGameEntity() {
        return gameEntity;
    }

    public void setGameEntity(GameEntity gameEntity) {
        this.gameEntity = gameEntity;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
