package nl.hu.bep.setup.webservices.requests;

public class Body {
    public int x;
    public int y;

    public Body(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Body(){}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
