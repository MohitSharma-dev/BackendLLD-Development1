package TicTacToe.models;

import java.util.Scanner;

public abstract class Player {
    private String name;
    private PlayerType playerType;
    private Symbol symbol;

    public Player() {
        this.name = "New Player";
        this.playerType = PlayerType.HUMAN;
        this.symbol = null;
    }

    public Player(String name, PlayerType playerType, Symbol symbol) {
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public Move mmakeMove(Board board){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row number:");
        int row = scanner.nextInt();
        System.out.println("Enter col number");
        int col =scanner.nextInt();
        Cell cell = new Cell(row,col);
        cell.setSymbol(this.getSymbol());
        cell.setCellState (CellState.FILLED);

        return new Move(cell, this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
