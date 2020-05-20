/*
File: DrawRobot.java

This Program draws a simple robot diagram in the window. It's
programming style leaves much to be desired, mostly because
the coordinate values are specified explicitly and not defined
so that they automatically adjust according to specified
parameters of the image as a whole. You will learn how to
improve the style.
 */
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class DrawRobot extends GraphicsProgram {
    @Override
    public void run() {
        add(new GOval(120, 20, 40, 40));
        add(new GRect(100, 60, 80, 110));
        add(new GRect(115, 170, 15, 70));
        add(new GRect(150, 170, 15, 70));
    }
    public static void main(String[] args) {
        new DrawRobot().start();
    }

}
