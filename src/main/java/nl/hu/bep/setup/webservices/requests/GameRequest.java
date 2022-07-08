package nl.hu.bep.setup.webservices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameRequest {
    private int turn;
    private Map<String, Object> you;
    private Game game;
    private Board board;

    public GameRequest() {
    }

    public int getTurn() {
        return turn;
    }

    public Map<String, Object> getYou() {
        return you;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
