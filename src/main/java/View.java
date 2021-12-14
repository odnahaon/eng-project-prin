package main.java;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class View {

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
        button.addActionListener((ActionListener) this);

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
        typeOf.getTypeToString();
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
        BufferStrategy bs = this.BufferStrategy();

        if (bs == null) {
            this.createBufferStrategy(3);
        }

        Graphics
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
        BufferStrategy bs = this.BufferStrategy();

        if (bs == null){
            this.createBufferStrategy(3);
        }
    }

    /*
    Toggle the day/night cycle
    @param isDay false = night; true = day
     */
    public void toggleDay(boolean isDay) {
        if 
        boolean isDay = true;
        boolean isDay = false;
}