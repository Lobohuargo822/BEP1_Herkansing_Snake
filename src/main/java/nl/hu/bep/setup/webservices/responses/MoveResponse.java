package nl.hu.bep.setup.webservices.responses;

public class MoveResponse {
    private String move;
    private String shout;

    public MoveResponse(String move, String shout) {
        this.move = move;
        this.shout = shout;
    }

    public String getMove() {
        return move;
    }

    public String getShout() {
        return shout;
    }
}
