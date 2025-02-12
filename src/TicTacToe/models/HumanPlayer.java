package TicTacToe.models;

public class HumanPlayer extends Player{
    private int coins;
    private int level;

    public HumanPlayer(String playerName, PlayerType playerType ,Symbol symbol) {
        super(playerName, playerType , symbol);
        this.coins = 100;
        this.level = 1;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
