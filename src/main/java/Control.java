package main.java;

import main.java.View;

public class Control {
    private View view = new View();
    public void main() {
        view.main();
    }

    private void reset() {
        view.reset();
    }

    private void collisionDetection() {
        boolean colli = false;
        if (colli) {
            reset();
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

    private void shiftBox() {

    }

    private void playAgain() {

    }
}
