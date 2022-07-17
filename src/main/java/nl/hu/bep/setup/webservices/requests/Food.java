package nl.hu.bep.setup.webservices.requests;

public class Food {
    public int x;
    public int y;

    public Food(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Food(){}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
