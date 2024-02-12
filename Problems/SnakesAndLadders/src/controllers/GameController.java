package controllers;

import models.Game;
import models.GameEntity;
import models.GameStatus;
import models.Player;

import java.util.List;

public class GameController {
    public Game startGame(List<Player> players, List<GameEntity> gameEntities) {
        return Game.getBuilder().setDimension(10).setPlayers(players).setGameEntities(gameEntities).build();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public GameStatus checkStatus(Game game) {
        return game.getGameStatus();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

}
