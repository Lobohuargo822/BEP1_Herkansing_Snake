package nl.hu.bep.setup.webservices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameRequest {
    private int turn;
    private Map<String, Object> you;
    private Game game;
    private Board board;

    public int getTurn() {
        return turn;
    }

    public Map<String, Object> getYou() {
        return you;
    }
}
