package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String playerName ,BotDifficultyLevel botDifficultyLevel) {
        super(playerName, PlayerType.BOT , new Symbol('B'));
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove() {
        return BotPlayingStrategyFactory
                .getBotPlayingStrategy(botDifficultyLevel)
                .makeMove(getGame().getBoard(), this);
    }
}

// Easy : diff
// Medium :