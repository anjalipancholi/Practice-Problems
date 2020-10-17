package String;

import java.util.Stack;

public class MaketheStringGreat {

  public static void main(String[] args) {
    new MaketheStringGreat().makeGood("aBbBc");
  }

  public String makeGood(String s) {
    Stack<Character> stack = new Stack();
    StringBuilder b = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (stack.isEmpty()) {
        stack.push(s.charAt(i));
      } else if (Character.isLowerCase(stack.peek()) &&
          Character.isUpperCase(s.charAt(i))) {
        if (stack.peek() == Character.toLowerCase(s.charAt(i))) {
          stack.pop();
        } else {
          stack.push(s.charAt(i));
        }
      } else if (Character.isUpperCase(stack.peek()) &&
          Character.isLowerCase(s.charAt(i))) {
        if (Character.toLowerCase(stack.peek()) == s.charAt(i)) {
          stack.pop();
        } else {
          stack.push(s.charAt(i));
        }
      } else {
        stack.push(s.charAt(i));
      }
    }
    for (int i = stack.size() - 1; i >= 0; i--) {
      b.append(stack.pop());
    }
    return b.reverse().toString();
  }
}
