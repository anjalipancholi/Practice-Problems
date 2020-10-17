package string;

public class ReplaceAllQuesMarksToAvoidConsecutiveRepeatingCharacters {

  public static void main(String[] args) {
    new ReplaceAllQuesMarksToAvoidConsecutiveRepeatingCharacters().modifyString("?w?s?c");
  }

  public String modifyString(String s) {
    if (s.length() == 0) {
      return s;
    }
    int n = s.length();
    char[] stringCharacter = s.toCharArray();
    for (int i = 0; i < n; i++) {
      if (stringCharacter[i] == '?') {
        for (char ch = 'a'; ch <= 'z'; ch++) {
          stringCharacter[i] = ch;
          if (i > 0 && stringCharacter[i - 1] == ch) {
            continue;
          }
          if (i < n - 1 && stringCharacter[i + 1] == ch) {
            continue;
          }
          break;
        }
      }
    }
    return new String(stringCharacter);
  }
}
