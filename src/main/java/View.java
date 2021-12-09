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

        public GameWindow(int w, int h, Stringtitle, Game game){
        game.setPreferedSize(new Dimension(w,h));

        }
        JFrame frame = new JFrame();
        frame.add(game)
    }

    /*
    Freeze animations, play any death animations, and display a play again button
     */
    public void reset() {
        JButton button = new JButton("Retry");
        button.

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
