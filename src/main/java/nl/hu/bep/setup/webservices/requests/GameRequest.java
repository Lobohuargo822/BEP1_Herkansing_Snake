package nl.hu.bep.setup.webservices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameRequest {
//    private Map<String, Object> you;
    private Game game;
    private int turn;
    private Board board;
    private You you;

    public GameRequest() {
    }

    public int getTurn() {
        return turn;
    }

//    public Map<String, Object> getYou() {
//        return you;
//    }


    public You getYou() {
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
