package methodology;

import acm.program.Program;
import acm.util.ErrorException;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MusicShop extends Program {

  /* Private instance variables */
  private JLabel label;
  private JTextField albumName;
  private MusicShopDisplay canvas;
  private final HashMap<String, Album> inventory =
      new HashMap<String, Album>();

  public static void main(String[] args) {
    new MusicShop().start();
  }

  // Set up initial display with interactors and canvas
  public void init() {
    label = new JLabel("methodology.Album Name");
    albumName = new JTextField(20);
    add(label, SOUTH);
    add(albumName, SOUTH);
    canvas = new MusicShopDisplay();
    add(canvas);
    loadInventory();
    addActionListeners();
    albumName.addActionListener(this);
  }

  // Read file to get inventory information on all albums
  private void loadInventory() {
    try {
      BufferedReader rd = new BufferedReader(
          new FileReader("music-data.txt"));
      while (true) {
        String line = rd.readLine();
        if (line == null) {
          break;
        }
        Album album = parseLine(line);
        inventory.put(album.getAlbumName(), album);
      }
      rd.close();
    } catch (IOException ex) {
      throw new ErrorException(ex);
    }
  }

  // Parse a single line from inventory file and returns an methodology.Album
  // object that contains the information from the line
  private Album parseLine(String line) {
    int albumNameStart = line.indexOf("[") + 1;
    int albumNameEnd = line.indexOf("]");
    String albumName = line.substring(albumNameStart, albumNameEnd);

    int bandNameStart = line.indexOf("[", albumNameEnd + 1) + 1;
    int bandNameEnd = line.indexOf("]", albumNameEnd + 1);
    String bandName = line.substring(bandNameStart, bandNameEnd);

    int numStockedStart = line.indexOf(" ", bandNameEnd + 1) + 1;
    int numStocked = Integer.parseInt(
        line.substring(numStockedStart));

    return (new Album(albumName, bandName, numStocked));
  }

  // Update the display whenever the user enters a new album name
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == albumName) {
      canvas.displayInventory(inventory.get(albumName.getText()));
    }
  }
}
