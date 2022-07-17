package nl.hu.bep.setup.webservices.requests;

public class Snake {
    public Head head;
    public Body body;

    public Snake(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    public Snake(){}

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }
}
