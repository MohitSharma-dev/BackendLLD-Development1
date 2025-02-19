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

    public Game(){
        this.board = null;
        this.players = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.winningStrategies = new ArrayList<>();
        this.gameState = GameState.TO_BE_STARTED;
    }

    public Game(
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

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void display(){
        // if game wants to print something
        board.display();
    }

    public boolean validate(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()){
            return false;
        }

        return move.getCell().getCellState().equals(CellState.EMPTY);
    }

    public void updateGameState(Move move , Player currentPlayer){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToChange);
        move.setPlayer(currentPlayer);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();
    }

    public boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }

    public boolean checkDraw(Move move){
//         all the cells are filled => game ends in a draw
        return moves.size() == board.getSize() * board.getSize();
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);

        System.out.println("It's " + currentPlayer.getName() + "'s turn. Please make your move!");

        Move move = currentPlayer.makeMove();

        if(!validate(move)){
            System.out.println("Invalid move ! Please try again!");
            return;
        }

//        update the state of the game
       updateGameState(move, currentPlayer);

        if(checkWinner(move)){
            winner = currentPlayer;
            setGameState(GameState.SUCCESS);
        } else if (checkDraw(move)){
            setGameState(GameState.DRAW);
        }

    }

    public void undo(){
//        just study what you did while making the move and reverse it
        if(moves.size() == 0){
            System.out.println("No moves to undo!");
            return;
        }

        Move lastMove = moves.get(moves.size()-1);
        moves.remove(moves.size()-1);

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);

        nextPlayerIndex--;
//        (a - b) % n = (a - b + n) % n
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();

//        we should go and update the counts hashmaps
        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleUndo(board, lastMove);
        }

        setGameState(GameState.IN_PROGRESS);
        setWinner(null);
    }
}

// make Move
//  get who will make the move ? nextPlayerIndex
// we will ask this player to make the move
//      HUMAN
        // We need to take row and column
        // validate
//      BOT
        // BASED ON DIFF WE WILL GENERATE THE MOVE OF THE BOT
//update the state of the Game
// checkWinner