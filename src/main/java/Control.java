package main.java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Control implements KeyListener {

    private final View view = new View();
    private final Model model = new Model();
    private int currPos = 0;
    private boolean started = false;
    private final ArrayList<Obstacles> obstacles = new ArrayList<>();

    public void main() {
        view.main();
    }

    public void start() {
        run();
        View.start();
        started = true;

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
        boolean collision = false;

        if (collision) {
            gameOver();
        }
    }

    private void generateObstacles() {
        SecureRandom rand = new SecureRandom();
        int randInt;
        if (currPos >= 500) {
            randInt = rand.nextInt(9);
        } else {
            randInt = rand.nextInt(6);
        }
        Obstacles typeOf = new Obstacles(new Position(currPos, 0), TypeOfObs.toObstacle(randInt));
        view.renderObstacles(typeOf);
    }

    private void jumpDetection() {
        shiftBox(0);
        view.jump();
    }

    private void downDetection() {
        shiftBox(1);
        view.down();
    }
    
    private void toggleDay() {
        boolean isDay;
        isDay = !model.getDayState();
        view.toggleDay(isDay);
    }

    /*
    Shifts the hit box of the dino
    @param s 0 = jump, 1 = down
     */
    private void shiftBox(int s) {
        if (s == 0) {

        } else if (s == 1) {

        }
    }

    public void playAgain() {
        currPos = 0;
        model.resetAllTheThings();
        view.playAgain();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Literally has no function, but it's needed anyway I guess?
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!started && e.getKeyCode() == KeyEvent.VK_SPACE) {
            start();
        }
        if (started) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_UP) {
                jumpDetection();
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                downDetection();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downDetection();
        }
    }
}
