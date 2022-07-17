package nl.hu.bep.setup.webservices.requests;

public class Game {
    public String id;
    public Ruleset ruleset;
    public int timeout;
    public String source;

    public Game(String id, Ruleset ruleset, int timeout, String source) {
        this.id = id;
        this.ruleset = ruleset;
        this.timeout = timeout;
        this.source = source;
    }

    public Game(){}

    public String getId() {
        return id;
    }

    public Ruleset getRuleset() {
        return ruleset;
    }

    public int getTimeout() {
        return timeout;
    }

    public String getSource() {
        return source;
    }
}
