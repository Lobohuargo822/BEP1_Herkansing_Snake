package nl.hu.bep.setup.webservices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Royale {
    public int shrinkEveryTurns;

    public Royale(){}

    public Royale(int shrinkEveryTurns) {
        this.shrinkEveryTurns = shrinkEveryTurns;
    }

    public int getShrinkEveryTurns() {
        return shrinkEveryTurns;
    }
}
