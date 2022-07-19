package nl.hu.bep.setup.webservices.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// het snake body
public class You {
    public String id;
    public String name;
    public String latency;
    public int health;
    public ArrayList<Body> body;
    public Head head;
    public int length;
    public String shout;
    public String squad;
    public Customization customizations;

    public You(String id, String name, String latency, int health, ArrayList<Body> body, Head head, int length,
               String shout, String squad, Customization customizations) {
        this.id = id;
        this.name = name;
        this.latency = latency;
        this.health = health;
        this.body = body;
        this.head = head;
        this.length = length;
        this.shout = shout;
        this.squad = squad;
        this.customizations = customizations;
    }

    public You(){}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLatency() {
        return latency;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Body> getBody() {
        return body;
    }

    public Head getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public String getShout() {
        return shout;
    }

    public String getSquad() {
        return squad;
    }

    public Customization getCustomizations() {
        return customizations;
    }

    public void avoidMyNeck(Head head, ArrayList<Body> body, ArrayList<String> possibleMoves){
        Body neck = body.get(1);
        if (neck.getX() < head.getX()){
            possibleMoves.remove("left");
        } else if (neck.getX() > head.getX()){
            possibleMoves.remove("right");
        } else if (neck.getY() < head.getY()){
            possibleMoves.remove("down");
        }  else if (neck.getY() > head.getY()){
            possibleMoves.remove("up");
        }
    }

    public void avoidBorder(Head head, ArrayList<String> possibleMoves, Board board){
//    public void avoidBorder(Head head, ArrayList<String> possibleMoves){
        if (head.getY() == board.getHeight()-1){
            possibleMoves.remove("up");
            possibleMoves.remove("left");
        } else if (head.getX() == board.getWidth()-1) {
            possibleMoves.remove("right");
            possibleMoves.remove("down");
        } else if (head.getY() == 0){
            possibleMoves.remove("left");
            possibleMoves.remove("down");
        } else if (head.getX() == 0){
            possibleMoves.remove("left");
            possibleMoves.remove("down");
        } else if (head.getY() == board.getHeight()-1 && head.getX() == board.getWidth()-1){
            possibleMoves.remove("up");
            possibleMoves.remove("right");
        } else if (head.getY() == 0 && head.getX() == 0){
            possibleMoves.remove("down");
            possibleMoves.remove("left");
        }
    }

    public void avoidBody(Head head, ArrayList<Body> body, ArrayList<String> possibleMoves){
        if(body.size() > 1){
            for(int i = 0; i < body.size(); i++){
                if (body.get(i).getX() < head.getX()){
                    possibleMoves.remove("left");
                } else if (body.get(i).getX() > head.getX()){
                    possibleMoves.remove("right");
                } else if (body.get(i).getY() < head.getY()){
                    possibleMoves.remove("down");
                }  else if (body.get(i).getY() > head.getY()){
                    possibleMoves.remove("up");
                }
            }
        }
    }
}
