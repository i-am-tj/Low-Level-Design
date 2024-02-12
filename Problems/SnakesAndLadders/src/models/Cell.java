package models;

import java.util.List;

public class Cell {
    int row;
    int col;
    List<Player> players;
    CellStatus cellStatus;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellStatus = CellStatus.EMPTY;
    }


}
