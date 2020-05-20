import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class BreakoutGame extends GraphicsProgram {

    /**
     * Width and height of application window in pixels
     */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;
    /**
     * Dimensions of game board (usually the same)
     */
    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;
    /**
     * Dimensions of the paddle
     */
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;
    /**
     * Offset of the paddle up from the bottom
     */
    private static final int PADDLE_Y_OFFSET = 30;
    /**
     * Number of bricks per row
     */
    private static final int NBRICKS_PER_ROW = 10;
    /**
     * Number of rows of bricks
     */
    private static final int NBRICK_ROWS = 10;
    /**
     * Separation between bricks
     */
    private static final int BRICK_SEP = 4;
    /**
     * Width of a brick
     */
    private static final int BRICK_WIDTH =
            (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;
    /**
     * Height of a brick
     */
    private static final int BRICK_HEIGHT = 8;
    /**
     * Radius of the ball in pixels
     */
    private static final int BALL_RADIUS = 10;
    /**
     * Offset of the top brick row from the top
     */
    private static final int BRICK_Y_OFFSET = 70;
    private GObject gobj;
    /**\

     * Number of turns
     */
    private static final int NTURNS = 3;
    private static final double Y_VELOCITY = 0;
    private GOval ball;
    private static final int DELAY = 8;
    private static final double GRAVITY = 3;
    private static final int x = 0;
    private static final int y = 0;
    private static final int x_velocity = 5;
    private double y_velocity = Y_VELOCITY;
    private GRect paddle;
    private double lastX;
    private double lastY;
private boolean play = true;


    public void run() {
        setup();

        addMouseListeners();


    }


    private void setup() {

        while (ball.getX() < getWidth()) {
            moveBall();
            checkForCollision();
            pause(DELAY);
        }



            int xOffset = 6;
            int startX = 0;
            for (int row = 0; row < 10; row++) {
                int y = BRICK_Y_OFFSET + (row * (BRICK_HEIGHT + BRICK_SEP));

                for (int col = 0; col < 10; col++) {
                    int x = xOffset + (startX + (col * (BRICK_WIDTH + BRICK_SEP)));


                    GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
                    add(brick);

                    if(row <2) {
                        brick.setFilled(true);
                        brick.setColor(RED);
                    }
                    else if(row > 1 && row < 4) {
                        brick.setFilled(true);
                        brick.setColor(ORANGE);
                    }
                    else if(row >3 && row < 6) {
                        brick.setFilled(true);
                        brick.setColor(YELLOW);
                    }
                    else if(row >5 && row < 8) {
                        brick.setFilled(true);
                        brick.setColor(GREEN);
                    }
                    else {
                        brick.setFilled(true);
                        brick.setColor(CYAN);
                    }

                }
            }
            GRect paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
            add(paddle, (APPLICATION_WIDTH - PADDLE_WIDTH) / 2, 540);
            paddle.setFilled(true);

            GOval ball = new GOval(BALL_RADIUS, BALL_RADIUS);
            add(ball);
            ball.setFilled(true);
        }
    public void mouseMoved(MouseEvent e) {

        //get the x-coordinate of the mouse
        double eX = e.getX();

        //if the mouse moved to the right
        if(eX - lastX > 0)
        {
            //if paddle is not already at the right wall
            if(paddle.getX() < WIDTH - PADDLE_WIDTH)
            {
                //move to the right
                paddle.move(eX - lastX, 0);
            }
        }
        else //(if the mouse moved to the left)
        {
            //if paddle is not already at the left wall
            if(paddle.getX() > 0)
            {
                //move to the left
                paddle.move(eX - lastX, 0);
            }
        }

        //record this mouse x position for next mouse event
        GPoint last = new GPoint(e.getPoint());
        lastX = last.getX();

    }
    private void moveBall() {

        // increase yVelocity due to gravity on each cycle
            y_velocity += GRAVITY;
        ball.move(x_velocity, y_velocity);

    }

    private void checkForCollision() {
        // determine if ball has dropped below the floor
        if (ball.getY() > getHeight() - BALL_RADIUS) {

            // change ball's Y velocity to now bounce upwards
            y_velocity = -y_velocity ;

            // assume bounce will move ball an amount above the
            // floor equal to the amount it would have dropped
            // below the floor.
            double diff = ball.getY() - (getHeight() - BALL_RADIUS);
            ball.move(0,-2*diff);
        }
    }



    private GObject getCollidingObject;




    public static void main(String[] args) {
        new BreakoutGame().start();
    }
}










