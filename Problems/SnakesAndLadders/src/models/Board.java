package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    private List<List<Cell>> board;

    List<GameEntity> gameEntities;

    public Board(int size, List<GameEntity> gameEntities) {
        this.size = size;
        this.board = new ArrayList<>(size);
        this.gameEntities = gameEntities;
        for(int i = 0; i < size; ++i) {
            board.add(new ArrayList<>(size));
            for(int j = 0; j < size; ++j) {
                board.get(i).add(new Cell(i, j));
            }
        }
        for(GameEntity gameEntity : gameEntities) {
            int start = gameEntity.getStart();
            int end = gameEntity.getEnd();
            int start_i;
            int start_j;
            if(start % 10 != 0) {
                start_i = start / 10;
                start_j = start % 10 - 1;
            } else {
                start_i = start / 10 - 1;
                start_j = 9;
            }
            int end_i;
            int end_j;
            if(end % 10 != 0) {
                end_i = end / 10;
                end_j = end % 10 - 1;
            } else {
                end_i = end / 10 - 1;
                end_j = 9;
            }
            board.get(start_i).get(start_j).setGameEntity(gameEntity);
            board.get(end_i).get(end_j).setGameEntity(gameEntity);
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    void printBoard() {
        for(int i = size-1; i >= 0; i--) {
            System.out.print(" | ");
            List<Cell> row = board.get(i);
            if(i % 2 != 0) {
                for(int j = size-1; j >= 0; j--) {
                    int pos = i*size + j + 1;
                    Cell cell = row.get(j);
                    cell.display(pos);
                }
            } else {
                for(int j = 0; j < size; j++) {
                    int pos = i*size + j + 1;
                    Cell cell = row.get(j);
                    cell.display(pos);
                }
            }

            System.out.println();
        }
    }

}
