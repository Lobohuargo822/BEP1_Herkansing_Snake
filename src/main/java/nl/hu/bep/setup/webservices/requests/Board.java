package nl.hu.bep.setup.webservices.requests;

import java.util.List;

public class Board {
    int height;
    int width;
    List<Snake> snakes;
    List<Food> food;
    List<Hazard> hazards;

    public Board(int height, int width, List<Snake> snakes, List<Food> food, List<Hazard> hazards) {
        this.height = height;
        this.width = width;
        this.snakes = snakes;
        this.food = food;
        this.hazards = hazards;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public List<Food> getFood() {
        return food;
    }

    public List<Hazard> getHazards() {
        return hazards;
    }
}
