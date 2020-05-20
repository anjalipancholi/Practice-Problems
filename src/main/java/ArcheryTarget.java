import acm.graphics.GFillable;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.applet.Applet;
import java.awt.*;
public class ArcheryTarget extends GraphicsProgram {
    public void run() {

       // for(int i = 0; i < 3; i++) {
         //   double y =  (i * RADIUS_OF_OUTER_CIRCLE) - 60;
           // for (int j = 0; j <3; j++) {
             //   double x =(j * RADIUS_OF_OUTER_CIRCLE) - 60;




                GRect circle = new GRect(RADIUS_OF_OUTER_CIRCLE, RADIUS_OF_OUTER_CIRCLE);
                add(circle, getWidth() / 2, getHeight() / 2);

            }

        



    private static final int RADIUS_OF_OUTER_CIRCLE = 72;
    private static final double DIAMETER_OF_MIDDLE_CIRCLE = 46.8;
    private static  final double DIAMETER_OF_INNER_CIRCLE = 21.6;


    public static void main(String[] args) {
        new ArcheryTarget().start();
    }
}