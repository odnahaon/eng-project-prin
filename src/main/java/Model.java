package main.java;

public class Model {

    private int score = 0;
    private boolean dayState = true;

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
}
