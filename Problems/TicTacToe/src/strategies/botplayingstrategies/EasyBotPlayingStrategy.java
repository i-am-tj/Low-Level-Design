package strategies.botplayingstrategies;

import models.Board;
import models.Cell;
import models.CellStatus;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell makeMove(Board board) {
        for(List<Cell> row : board.getBoard()) {
            for(Cell cell : row) {
                if(cell.getCellStatus().equals(CellStatus.EMPTY)) {
                    return new Cell(cell.getRow(), cell.getCol());
                }
            }
        }
        return null;
    }
}
