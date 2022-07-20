package nl.hu.bep.setup.webservices.responses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class MoveResponse {
    private String move;
//    private String shout;
//    private final ArrayList<String> possibleMoves = new ArrayList<>(Arrays.asList("up", "down", "left", "right"));
//    private final ArrayList<String> possibleshouts = new ArrayList<>(Arrays.asList("move up", "move down", "move left", "move right"));

    public MoveResponse(String move) {
        this.move = move;
//        this.shout = shout;
    }

//    public MoveResponse(){}

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

//    public String getShout() {
//        return shout;
//    }
//
//    public void setShout(String shout) {
//        this.shout = shout;
//    }

//    public ArrayList<String> getPossibleMoves() {
//        return possibleMoves;
//    }

//    public ArrayList<String> getPossibleshouts() {
//        return possibleshouts;
//    }
}
