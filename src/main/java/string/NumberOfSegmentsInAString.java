package string;

public class NumberOfSegmentsInAString {

  public static void main(String[] args) {
    new NumberOfSegmentsInAString().countSegments("");
  }

  public int countSegments(String s) {
    String trimmed = s.trim();
    if (trimmed.equals("")) {
      return 0;
    }
    return trimmed.split("\\s+").length;
  }
}
