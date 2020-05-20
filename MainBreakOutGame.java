
import acm.graphics.GRect;

import javax.swing.*;
import javax.swing.JFrame;

import java.awt.*;

import static java.awt.Color.*;

public class MainBreakOutGame {


    public static void main(String[] args) {
        JFrame obj = new JFrame();


        obj.setBounds(10, 10, 400, 600);
        obj.setTitle("Breakout Game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
