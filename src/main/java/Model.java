package main.java;

import java.util.ArrayList;

public class Model {

    private int score = 0;
    private boolean dayState = true;
    ArrayList<Obstacles> obstacles = new ArrayList<Obstacles>();

    public int getScore() {
        return score;
    }

    public void resetScore() {
        score = 0;
    }

    public boolean getDayState() {
        return dayState;
    }

    public void resetDayState() {
        dayState = true;
    }

    public ArrayList<Obstacles> getObstacles() {
        return obstacles;
    }

    public void addObstacle(Obstacles o) {
        obstacles.add(o);
    }
    
    public void removeObstacle(int index) {
        removeObstacle(index);
    }
}
