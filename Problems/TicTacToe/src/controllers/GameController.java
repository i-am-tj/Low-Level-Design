package controllers;

import exceptions.DuplicateSymbolException;
import exceptions.MoreThanOneBotException;
import exceptions.PlayersCountDimensionMismatchException;
import models.Game;
import models.GameStatus;
import models.Player;
import strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimensionOfBoard, List<Player> players, List<WinningStrategy> winningStrategies) throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {
        return Game.getBuilder().setDimension(dimensionOfBoard).setPlayers(players).setWinningStrategies(winningStrategies).build();
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

    public Game undo(Game game) {
        return null;
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }



}
