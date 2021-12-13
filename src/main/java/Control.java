package main.java;

import main.java.View;

public class Control {
    private View view = new View();
    private Model model = new Model();
    public void main() {
        view.main();
    }

    private void gameOver() {
        view.gameOver();
    }

    private void collisionDetection() {
        boolean colli = false;
        if (colli) {
            gameOver();
        }
    }

    private void generateObstacles() {

    }

    private void jumpDetection() {
        view.jump();
    }

    private void downDetection() {
        view.down();
    }
    
    private void toggleDay() {
        boolean isDay;
        isDay = !model.getDayState();
        view.toggleDay(isDay);
    }

    private void shiftBox() {

    }

    private void playAgain() {
        view.playAgain();
    }
}
