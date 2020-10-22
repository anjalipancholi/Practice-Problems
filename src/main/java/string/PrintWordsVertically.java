package string;


import java.util.ArrayList;
import java.util.List;

/**
 * 1324. Print Words Vertically
 */
public class PrintWordsVertically {
    public List<String> printVertically(String s) {
        String[] split = s.split(" ");
        List<String> result = new ArrayList<>();
        int index = 0;
        int maxLength = 0;
        for (int i = 0; i < split.length; i++) {
            maxLength = Math.max(split[i].length(), maxLength);
        }
        while (index < maxLength) {
            int length = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                if (index < split[i].length()) {
                    sb.append(split[i].charAt(index));
                    length = i;
                } else {
                    sb.append(" ");
                }
            }
            index++;
            result.add(sb.toString().substring(0, length + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new PrintWordsVertically().printVertically("CONTEST IS COMING"));
    }
}
