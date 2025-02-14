package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

//    Don't forget to have constructors
//    moves.add() => NullPointerException

    //public Game(){
    private Game(){
        this.board = null;
        this.players = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.winningStrategies = new ArrayList<>();
        this.gameState = GameState.TO_BE_STARTED;
    }

    //public Game(
    private Game(
            int size ,
            List<Player> players,
            List<WinningStrategy> winningStrategies
     ) {
//               size will be used for Board creation
        this();
        this.board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
    }

    private Game(GameBuilder builder){
        this.board = builder.board;
        this.players = builder.players;
        this.nextPlayerIndex = builder.nextPlayerIndex;
        this.winner = builder.winner;
        this.moves = builder.moves;
        this.winningStrategies = builder.winningStrategies;
        this.gameState = builder.gameState;
    }
    //getBuilder method:
    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public static class GameBuilder{
        private Board board;
        private List<Player> players;
        private int nextPlayerIndex;
        private Player winner;
        private List<Move> moves;
        private GameState gameState;
        private List<WinningStrategy> winningStrategies;

        public GameBuilder(){
            this.board = null;
            this.players = new ArrayList<>();
            this.nextPlayerIndex = 0;
            this.winner = null;
            this.moves = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.gameState = GameState.TO_BE_STARTED;
        }
        public GameBuilder( int size,
                            List<Player> players,
                            List<WinningStrategy> winningStrategies){
            this.board=new Board(size);
            this.players = players;
            this.winningStrategies = winningStrategies;
            this.gameState = GameState.IN_PROGRESS;
        }

        //build method:
        public Game build(){
            return new Game(this);
        }

        //setter methods in the Builder class:
        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setNextPlayerIndex(int nextPlayerIndex) {
            this.nextPlayerIndex = nextPlayerIndex;
            return this;
        }

        public GameBuilder setWinner(Player winner) {
            this.winner = winner;
            return this;
        }

        public GameBuilder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }
        public GameBuilder setGameState(GameState gameState) {
            this.gameState = gameState;
            return this;
        }
        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }


    } //end GameBuilder


    //getters in the outer class(i.e Game class):
    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }


    public void display(){
        // if game wants to print something
        board.display();
    }

    //makeMove
    public void makeMove(){
        Player currPLayer = players.get(nextPlayerIndex);
        Move move = currPLayer.mmakeMove(board);


        //update cell
        List<List<Cell>> grid = getBoard().getGrid();
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        grid.get(row).get(col).setCellState(CellState.FILLED);
        grid.get(row).get(col).setSymbol(currPLayer.getSymbol());

        moves.add(move);
        ++nextPlayerIndex;

        //check winner
        for( WinningStrategy winStrategy: winningStrategies) {
            boolean result = winStrategy.checkWinner(board,move);
            if(result == true)
                this.gameState=GameState.SUCCESS;
        }

        boolean isGridFull = true;
        for(List<Cell> gridRow :grid){
            for(Cell cell: gridRow){
                if(cell.getCellState() == CellState.EMPTY){
                    isGridFull = false;
                    break;
                }

            }
        }

        if(gameState.equals(GameState.SUCCESS))
        {
            winner=currPLayer;
        }
        if(!gameState.equals(GameState.SUCCESS) && isGridFull ==true )
            this.gameState=GameState.DRAW;

    }
}
