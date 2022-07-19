package nl.hu.bep.setup.webservices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class GameRequest {
//    private Map<String, Object> you;
    private Game game;
    private int turn;
    private Board board;
    private You you;

    public GameRequest() {
    }

    public GameRequest(Game game, int turn, Board board, You you) {
        this.game = game;
        this.turn = turn;
        this.board = board;
        this.you = you;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public You getYou() {
        return you;
    }

    public void setYou(You you) {
        this.you = you;
    }
}
