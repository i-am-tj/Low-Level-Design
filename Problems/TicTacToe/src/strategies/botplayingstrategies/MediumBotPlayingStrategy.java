package strategies.botplayingstrategies;

import models.Board;
import models.Cell;
import models.CellStatus;

import java.util.List;
import java.util.Random;

public class MediumBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell makeMove(Board board) {
        int size = board.getSize();
        Random r = new Random();
        int col = r.nextInt(0, size);
        int row = r.nextInt(0, size);
        List<List<Cell>> curr = board.getBoard();
        while(!curr.get(row).get(col).getCellStatus().equals(CellStatus.EMPTY)) {
            col = r.nextInt(0, size);
            row = r.nextInt(0, size);
        }
        return new Cell(row, col);
    }
}
