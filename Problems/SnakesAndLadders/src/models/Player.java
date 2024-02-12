package models;

public class Player {
    private String name;
    PlayerType playerType;
    int position;

    public Player(String name, PlayerType playerType) {
        this.name = name;
        this.playerType = playerType;
        this.position = 0;
    }

    public Move makeMove(Board board, Dice dice) {
        System.out.println("Player: " + getName() + " making a move from position: " + position);
        int sixChecks = 3;
        int nextPos = position;
        while(sixChecks >= 0) {
            if(sixChecks == 0) {
                nextPos = position;
                sixChecks = 3;
            }
            int diceNumber = dice.rollDice();
            System.out.println("Dice Rolled. Face value: " + diceNumber);
            if(diceNumber != 6) {
                sixChecks = 0;
            }
            System.out.println("Since found 6. Rolling the dice again.");
            nextPos += diceNumber;
            sixChecks--;
        }
        //2. Check if it's snake head or ladder tail
        int row = nextPos / 10 - 1;
        int col = nextPos % 10 - 1;
        GameEntity gameEntity = board.getBoard().get(row).get(col).getGameEntity();
        if(gameEntity.equals(GameEntityType.SNAKE)) {
            if(gameEntity.getStart() == nextPos) {
                nextPos = gameEntity.getEnd();
            }
        } else if (gameEntity.equals(GameEntityType.LADDER)) {
            if(gameEntity.getEnd() == nextPos) {
                nextPos = gameEntity.getStart();
            }
        }
        int new_rol = nextPos / 10 - 1;
        int new_col = nextPos % 10 - 1;
        return new Move(this, new Cell(new_rol, new_col));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
