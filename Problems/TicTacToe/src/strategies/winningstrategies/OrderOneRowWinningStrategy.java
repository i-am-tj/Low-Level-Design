package strategies.winningstrategies;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class OrderOneRowWinningStrategy implements WinningStrategy {
    private final Map<Integer, HashMap<Symbol, Integer>> rowCounter = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //1. Get Row
        int row = move.getCell().getRow();
        //2. Get Player Symbol
        Symbol symbol = move.getPlayer().getSymbol();
        //3. Check for symbol size in row
        if(!rowCounter.containsKey(row)) {
            rowCounter.put(row, new HashMap<>());
        }
        Map<Symbol, Integer> curr = rowCounter.get(row);
        curr.put(symbol, curr.getOrDefault(symbol, 0) + 1);
        if(curr.get(symbol).equals(board.getSize())) {
            return true;
        }
        return false;
    }
}
