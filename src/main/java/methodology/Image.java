package methodology;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Image extends GraphicsProgram {


  public void run() {
    add(new GImage("/home/dhruv/Downloads/wallpaper.jpg"));


  }
  //private GObject gimage;

  // private GImage flipHorizontal(GImage gimage) {
  //    int[][] array = gimage.getPixelArray();
  //  int width = array[0].length;
  //int height = array.length;
  //for (int row = 0; row < height; row++) {
  //for (int p1 = 0; p1 < width / 2; p1++) {
  //    int p2 = width - p1 - 1;
  //  int temp = array[row][p1];
  //array[row][p1] = array[row][p2];
  //  array[row][p2] = temp;
  //}
  //   }
  // return new GImage(array);
  //}


  public static void main(String[] args) {
    new Image().start();
  }

}
