package strategies.winningstrategies;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class OrderOneDiagonalWinningStrategy implements WinningStrategy{
    private final Map<Symbol, Integer> leftDiagCounter = new HashMap<>();
    private final Map<Symbol, Integer> rightDiagCounter = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //1. Get Row and Col
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        //2. Get Player Symbol
        Symbol symbol = move.getPlayer().getSymbol();
        //3. Check for symbol count in diagonals
        //3.1. Check for left diagonal
        if(row == col) {
            int leftDiagCount = leftDiagCounter.getOrDefault(symbol, 0) + 1;
            if(leftDiagCount == board.getSize()) {
                return true;
            }
            leftDiagCounter.put(symbol, leftDiagCount);
        }
        if(row + col == board.getSize() - 1) {
            int rightDiagCount = rightDiagCounter.getOrDefault(symbol, 0) + 1;
            if(rightDiagCount == board.getSize()) {
                return true;
            }
            rightDiagCounter.put(symbol, rightDiagCount);
        }
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        //1. Get row and col from move
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        //2. Get Player Symbol
        Symbol symbol = move.getPlayer().getSymbol();
        //3. Decrement the Symbol from both maps (if exists)
        if(row == col) {
            if(leftDiagCounter.containsKey(move.getPlayer().getSymbol())) {
                int val = leftDiagCounter.get(symbol) - 1;
                if(val == 0) leftDiagCounter.remove(symbol);
                else leftDiagCounter.put(symbol, val);
            }
        }
        if(row + col == board.getSize() - 1) {
            if(rightDiagCounter.containsKey(move.getPlayer().getSymbol())) {
                int val = rightDiagCounter.get(symbol) - 1;
                if(val == 0) rightDiagCounter.remove(symbol);
                else rightDiagCounter.put(symbol, val);
            }
        }
    }
}
