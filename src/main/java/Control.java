package main.java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Control implements KeyListener {

    private View view = new View();
    private Model model = new Model();
    int currPos = 0;
    ArrayList<Obstacles> obstacles = new ArrayList<Obstacles>();

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
        Obstacles typeOf = new Obstacles(new Position(currPos, 0), TypeOfObs.toObstacle(randInt));
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

    @Override
    public void keyTyped(KeyEvent e) {
        // Literally has no function but it's needed anyways I guess?
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_UP) {
            jumpDetection();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downDetection();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downDetection();
        }
    }
}
