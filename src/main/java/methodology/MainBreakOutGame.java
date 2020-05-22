package methodology;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

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
