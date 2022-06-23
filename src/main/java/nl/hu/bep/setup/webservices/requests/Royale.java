package nl.hu.bep.setup.webservices.requests;

public class Royale {
    public int shrinkEveryTurns;

    public Royale(int shrinkEveryTurns) {
        this.shrinkEveryTurns = shrinkEveryTurns;
    }

    public int getShrinkEveryTurns() {
        return shrinkEveryTurns;
    }
}
