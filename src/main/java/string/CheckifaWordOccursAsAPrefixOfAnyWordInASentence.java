package string;

/**
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */
public class CheckifaWordOccursAsAPrefixOfAnyWordInASentence {

    public static void main(String[] args) {
        System.out.println(new CheckifaWordOccursAsAPrefixOfAnyWordInASentence()
                .PrefixOfWord("dumb dream duck duck i",
                "drea"));
    }

    //Approach 1:
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    //Approach 2:
    public int PrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() >= searchWord.length()) {
                for (int j = 0; j < searchWord.length(); j++) {
                    if (split[i].charAt(j) != searchWord.charAt(j)) {
                        break;
                    }
                    if (j == searchWord.length() - 1) {
                        return i + 1;
                    }
                }
            }
        }
        return -1;
    }
}






