package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    List<List<Cell>> board;

    public Board(int size) {
        this.size = size;
        this.board = new ArrayList<>(size);
        for(int i = 0; i < size; ++i) {
            board.add(new ArrayList<>(size));
            for(int j = 0; j < size; ++j) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void printBoard() {
        for(List<Cell> row : board) {
            System.out.print("|");
            for(Cell cell : row) {
                cell.display();
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
