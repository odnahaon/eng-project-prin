package main.java;

import java.security.SecureRandom;

public class Control {

    private View view = new View();
    private Model model = new Model();
    int currPos = 0;

    public void main() {
        view.main();
    }

    private void run() {

        if (currPos == 600) {
            toggleDay();
        }
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
        SecureRandom rand = new SecureRandom();
        int randInt = 69;
        if (currPos >= 500) {
            randInt = rand.nextInt(9);
        } else {
            randInt = rand.nextInt(6);
        }
        Obstacles typeOf = new Obstacles(currPos, TypeOfObs.toObstacle(randInt));
        view.renderObstacles(typeOf);
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
