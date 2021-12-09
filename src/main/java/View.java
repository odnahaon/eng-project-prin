package main.java;

import java.awt.*;
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
        JFrame frame = new JFrame();
    }

    /*
    Freeze animations, play any death animations, and display a play again button
     */
    public void reset() {
        JButton button = new JButton("Retry");
        button.

        JLabel label = new JLabel("Click to retry");
    }

    /*
    Display a graphic for the obstacle depending on the number. Assign an obstacle to each number beginning with 0 and working upwards.
     */
    public void renderObstacles(int typeOf) {

    }

    /*
    Play a jumping animation.
     */
    public void jump() {
        try {
            File jumpImageFile = new File("");
            Image jumpImage = ImageIO.read(jumpImageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Play a crouching animation.
     */
    public void down() {
        try {
        File crouchImageFile = new File("");
        Image crouchImage = ImageIO.read(crouchImageFile);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
