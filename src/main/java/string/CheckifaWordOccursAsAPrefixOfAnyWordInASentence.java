package string;

public class CheckifaWordOccursAsAPrefixOfAnyWordInASentence {

  public static void main(String[] args) {
    new CheckifaWordOccursAsAPrefixOfAnyWordInASentence().isPrefixOfWord("a b c d", "b");
  }

  public int isPrefixOfWord(String sentence, String searchWord) {
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].startsWith(searchWord)) {
        return i + 1;
      }
    }
    return -1;
  }
}

