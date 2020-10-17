package String;

public class reverseWords {

  public String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      sb.append(new StringBuffer(i).reverse().toString() + " ");
    }
    return sb.toString().trim();
  }
}
