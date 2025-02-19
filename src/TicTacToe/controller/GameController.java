package TicTacToe.controller;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
//    private Game game;
    public Game startGame(
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
//        for practice : Implement Builder to create the object of the game
//        validations :
//            1. Only one Bot is allowed
//            2. All the players should have different symbol
//            3. Count of players = size - 1
        return new Game(size , players , winningStrategies);
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void display(Game game){
        game.display();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }
}


// what methods game should expose to the client
// 1. startGame (size , players , winningStrategies)
// 2. makeMove
// 3. checkGameState
// 4. display
// 5. getWinner
// 6. undo

// three builders
