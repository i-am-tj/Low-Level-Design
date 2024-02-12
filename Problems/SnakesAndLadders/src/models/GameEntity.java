package models;

public class GameEntity {
    String name;
    GameEntityType gameEntityType;
    int start;
    int end;

    public GameEntity(String name, GameEntityType gameEntityType, int start, int end) {
        this.name = name;
        this.gameEntityType = gameEntityType;
        this.start = start;
        this.end = end;
    }

    public GameEntityType getGameEntityType() {
        return gameEntityType;
    }

    public void setGameEntityType(GameEntityType gameEntityType) {
        this.gameEntityType = gameEntityType;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
