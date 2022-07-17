package nl.hu.bep.setup.webservices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Turn {
    public int turn;

    public Turn(int turn) {
        this.turn = turn;
    }

    public int getTurn() {
        return turn;
    }
}
