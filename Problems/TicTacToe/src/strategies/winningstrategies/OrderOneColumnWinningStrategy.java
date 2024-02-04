package strategies.winningstrategies;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class OrderOneColumnWinningStrategy implements WinningStrategy {
    private final Map<Integer, HashMap<Symbol, Integer>> colCounter = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //1. Get Col
        int col = move.getCell().getCol();
        //2. Get Player Symbol
        Symbol symbol = move.getPlayer().getSymbol();
        //3. Check for symbol size in col
        if(!colCounter.containsKey(col)) {
            colCounter.put(col, new HashMap<>());
        }
        Map<Symbol, Integer> curr = colCounter.get(col);
        curr.put(symbol, curr.getOrDefault(symbol, 0) + 1);
        if(curr.get(symbol).equals(board.getSize())) {
            return true;
        }
        return false;
    }
}
