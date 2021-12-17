package main.java;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.File;
import java.io.IOException;

public class View extends JFrame {

    private BufferStrategy bs;
    private final Control ctrl = new Control();
    private boolean Opaque;

    /*
    Initialize your windows.
     */
    public void main() {
    }

    public static void start() {
        JFrame frame = new JFrame();
    }

    /*
    Freeze animations, play any death animations, and display a play again button
     */
    public void gameOver() {
        JButton button = new JButton("Retry");
        button.addActionListener(e -> ctrl.playAgain());
    }

    /*
    Reset the dino to the start, clear all obstacles, change to day, reset score to 0
     */
    public void playAgain() {
        
    }

    /*
    Display a graphic for the obstacle depending on the number. Assign an obstacle to each number beginning with 0 and working upwards.
     */
    public void renderObstacles(Obstacles typeOf) {
        // This gives you the name of the obstacle to place, may be helpful
        Obstacles.getTypeToString();
    }

    /*
    Play a jumping animation.
     */
    public void jump() {
        try {
            File jumpImageFile = new File("/resources/dino-jump.png");
            Image jumpImage = ImageIO.read(jumpImageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (bs == null) {
            this.createBufferStrategy(3);
        }
    }

    /*
    Play a crouching animation.
     */
    public void down() {
        try {
        File crouchImageFile = new File("/resources/dino-duck-1.png");
        Image crouchImage = ImageIO.read(crouchImageFile);
        } catch(IOException e) {
            e.printStackTrace();
        }

        if (bs == null){
            this.createBufferStrategy(3);
        }
    }

    /*
    Toggle the day/night cycle
    @param isDay false = night; true = day
     */
    public void toggleDay(boolean isDay) {
        if (isDay) {
            // Change the colors to not be inverted
            Opaque = false;
        }
        else {
            // Invert the colors
            Opaque = true;
            
        }
    }
}
