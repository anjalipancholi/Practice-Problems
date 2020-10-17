package array;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

  public static void main(String[] args) {
    new RemoveAllAdjacentDuplicatesInString().removeDuplicates("abbacb");
  }

  public String removeDuplicates(String S) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < S.length(); i++) {
      Character c = S.charAt(i);
      if (stack.isEmpty() || c != stack.peek()) {
        stack.push(c);
      } else {
        stack.pop();
      }
    }
    StringBuilder object = new StringBuilder();
    while (!stack.isEmpty()) {
      object.append(stack.peek());
      stack.pop();
    }
    return object.reverse().toString();
  }
}
