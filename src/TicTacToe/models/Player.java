package TicTacToe.models;

public abstract class Player {
    private String name;
    private PlayerType playerType;
    private Symbol symbol;
    private Game game;

    public Player() {
        this.name = "New Player";
        this.playerType = PlayerType.HUMAN;
        this.symbol = null;
        this.game = null;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player(String name, PlayerType playerType, Symbol symbol) {
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
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

    public abstract Move makeMove();
}
