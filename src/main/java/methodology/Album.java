package methodology;

public class Album {

  /* private instance variables */
  private final String albumName;
  private final String bandName;
  private final int numStocked;

  // Constructor
  public Album(String album, String band, int stock) {
    albumName = album;
    bandName = band;
    numStocked = stock;
  }

  public String getAlbumName() {
    return albumName;
  }

  public String getBandName() {
    return bandName;
  }

  public int getNumStocked() {
    return numStocked;
  }

  // Returns a string representation of an album, listing
// the album name, the band name, and the number in stock
  public String toString() {
    return ("\"" + albumName +
        "\" by " + bandName +
        ": " + numStocked + " in stock");
  }
}








