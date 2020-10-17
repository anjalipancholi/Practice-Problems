package HashTable;

import java.util.ArrayList;
import java.util.Arrays;

public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        ArrayList list = new ArrayList();
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(second) && words[i - 1].equals(first)) {
                list.add(words[i + 1]);
            }
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        new OccurrencesAfterBigram().findOcurrences("abcdef", "b", "c");
    }
}
