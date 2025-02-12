package TicTacToe;

import TicTacToe.controller.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.RowWinningStrategy;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Client will be interacting with the GameController
//        GameController gameController = new GameController();
//        gameController.startGame();
//
//        GameController gameController2 = new GameController();

//        Controller : Singleton class : HW

        GameController gameController = new GameController();

        Player player1 = new HumanPlayer("Akash" , PlayerType.HUMAN , new Symbol('X'));
        Player player2 = new Bot("Botty", BotDifficultyLevel.EASY);

        Game game = gameController.startGame(
                3,
                List.of(player1 , player2),
                List.of(new RowWinningStrategy())
        );

        gameController.display(game);

        while(gameController.getGameState(game) == GameState.IN_PROGRESS){
            gameController.makeMove(game);
            gameController.display(game);
        }

//        check if winner is there or draw
        if(gameController.getGameState(game) == GameState.SUCCESS){
            System.out.println("WE HAVE A WINNER!");
            System.out.println("And the winner isssss : " + gameController.getWinner(game).getName());
        } else if(gameController.getGameState(game) == GameState.DRAW){
            System.out.println("OOPS! The game ends in a DRAW!");
        }

    }
}


// Client (HardCoded / Command Line Input) -> GameController
// Models => Game,  Board , Cell , Move etc

//|-||-||-|
//|-||-||-|
//|-||-||-|


// REST API

// Steps :
// Step 1 : Code the models (Translate the class diagram)
// Step 2 : Structure of GameController
// Step 3 : Client
// Step 4 : Start building diff functionalities

// HW1 : Please execute controller to be a singleton for practice
// HW2 : Please execute Builder for Game object
// HW3(P0) : Please try to implement makeMove : try to run the game
