package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> grid;

    public Board(int size) {
        this.size = size;
//        based on size we would need to construct the board
        this.grid = new ArrayList<>();
        buildBoard();
    }

    private void buildBoard(){
        for(int i = 0; i < size; i++) {
            grid.add(new ArrayList<>());
            for(int j = 0; j < size; j++) {
                grid.get(i).add(new Cell(i, j));
            }
        }
    }

    public void display(){
//        I can every cell to display themselves
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                grid.get(i).get(j).display();
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

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }
}
