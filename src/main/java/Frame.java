package main.java;

import javax.swing.*;
import main.java.Panel;

public class Frame extends JFrame {
    Frame() {

        this.add(new Panel());
        this.setTitle("Dino RipOff");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        game.start();
    }
}