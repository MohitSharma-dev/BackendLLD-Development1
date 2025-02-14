package TicTacToe.strategies;

import TicTacToe.models.*;

import java.util.List;

public class EasyPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
//       Find the first empty cell and make the move there
        for (List<Cell> row : board.getGrid()){
            for (Cell cell : row){
                if (cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(cell.getRow() , cell.getCol()) , player);
                }
            }
        }
        return null;
    }
}
