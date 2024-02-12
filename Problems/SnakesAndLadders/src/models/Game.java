package models;

import strategies.entitygenerationstrategy.GameEntityGenerationStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    Board board;
    List<Move> moves;
    List<Player> players;
    List<GameEntity> gameEntities;
    Dice dice;
    int currPlayerIdx;
    private GameStatus gameStatus;
    private Player winner;


    public static Builder getBuilder() {
        return new Builder();
    }

    private Game(int dimension, List<Player> players, List<GameEntity> gameEntities) {
        this.moves = new ArrayList<>();
        this.board = new Board(dimension, gameEntities);
        this.gameEntities = gameEntities;
        this.players = players;
        this.currPlayerIdx = 0;
        this.dice = new NormalDice();
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<GameEntity> gameEntities;

        private Builder() {
            this.dimension = 0;
            this.players = new ArrayList<>();
            this.gameEntities = new ArrayList<>();
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setGameEntities(List<GameEntity> gameEntities) {
            this.gameEntities = gameEntities;
            return this;
        }

        public Game build() {
            return new Game(dimension, players, gameEntities);
        }
    }

    public void printBoard() {
        board.printBoard();
    }

    public void makeMove() {
        //1. Get Current Player
        Player currPlayer = players.get(currPlayerIdx);
        System.out.println("Player: " + currPlayer.getName() + "'s turn.");
        //2. Make a move
        Move currMove = currPlayer.makeMove(board, dice);


        //3. Check if winner
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }



}
