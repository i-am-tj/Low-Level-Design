package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
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

    void printBoard() {

    }

}
