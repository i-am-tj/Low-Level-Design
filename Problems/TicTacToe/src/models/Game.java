package models;

import exceptions.DuplicateSymbolException;
import exceptions.MoreThanOneBotException;
import exceptions.PlayersCountDimensionMismatchException;
import strategies.winningstrategies.WinningStrategy;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Move> moves;
    private Board board;
    private List<Player> players;
    private int currPlayerIdx;
    private List<WinningStrategy> winningStrategies;
    private GameStatus gameStatus;
    private Player winner;

    public static Builder getBuilder() {
        return new Builder();
    }

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.players = players;
        this.currPlayerIdx = 0;
        this.winningStrategies = winningStrategies;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public static class Builder {
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimension;

        private Builder() {
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.dimension = 0;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        private void validateBotCounts() throws MoreThanOneBotException {
            int botCount = 0;
            for(Player player : players) {
                if(player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }
            if(botCount > 1) {
                throw new MoreThanOneBotException();
            }
        }

        private void validateDimensionAndPlayersCount() throws PlayersCountDimensionMismatchException {
            if(players.size() != dimension - 1) {
                throw new PlayersCountDimensionMismatchException();
            }
        }

        private void validateUniqueSymbolForPlayers() throws DuplicateSymbolException {
            Map<Character, Integer> symbolPlayer = new HashMap<>();
            for(Player player : players) {
                Character symbol = player.getSymbol().getaChar();
                Integer countForPlayer = symbolPlayer.getOrDefault(symbol, 0);
                if(countForPlayer > 1) {
                    throw new DuplicateSymbolException();
                }
                symbolPlayer.put(symbol, countForPlayer);
            }
        }

        private void validate() throws DuplicateSymbolException, MoreThanOneBotException, PlayersCountDimensionMismatchException {
            validateBotCounts();
            validateDimensionAndPlayersCount();
            validateUniqueSymbolForPlayers();
        }

        private Game Build() throws DuplicateSymbolException, MoreThanOneBotException, PlayersCountDimensionMismatchException {
            validate();
            return new Game(dimension, players, winningStrategies);
        }
    }

    public void printBoard() {
        board.printBoard();
    }

    private boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row >= board.getSize()) return false;
        if(col >= board.getSize()) return false;

        if(board.getBoard().get(row).get(col).getCellStatus().equals(CellStatus.EMPTY)) return true;

        return false;
    }

    private boolean checkWinner(Board board, Move move) {
        for(WinningStrategy winningStrategy : winningStrategies) {
            if(winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    public void makeMove() {
        Player currPlayer = players.get(currPlayerIdx + 1);
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getCurrPlayerIdx() {
        return currPlayerIdx;
    }

    public void setCurrPlayerIdx(int currPlayerIdx) {
        this.currPlayerIdx = currPlayerIdx;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
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