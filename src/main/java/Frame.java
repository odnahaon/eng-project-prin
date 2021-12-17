package main.java;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Frame() {

        this.add(new Panel());
        this.setTitle("Dino RipOff");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        View.start();
    }
}