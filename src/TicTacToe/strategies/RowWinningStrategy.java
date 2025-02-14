package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    private Map<Integer , HashMap<Character, Integer>> rowCount;
//    { row : {sym : count } }

    public RowWinningStrategy() {
        rowCount = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        Character ch = move.getCell().getSymbol().getSym();

        if(!rowCount.containsKey(row)){
            rowCount.put(row, new HashMap<>());
        }

        Map<Character , Integer> rowMap = rowCount.get(row);
//        {'x' : 0 , 'b' : 3}
        if(!rowMap.containsKey(ch)){
            rowMap.put(ch, 0);
        }
//        increase the frequency of the character in the particular row
        rowMap.put(ch, rowMap.get(ch) + 1);

        if(rowMap.get(ch) == board.getSize()){
            return true;
        }

        return false;

    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        Character ch = move.getPlayer().getSymbol().getSym();

//        decrease the frequency
        rowCount.get(row).put(ch, rowCount.get(row).get(ch) - 1);
    }
}

// O(1) =>
