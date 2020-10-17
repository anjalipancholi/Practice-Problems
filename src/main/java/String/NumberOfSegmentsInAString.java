package String;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    public static void main(String[] args) {
        new NumberOfSegmentsInAString().countSegments("");
    }
}
