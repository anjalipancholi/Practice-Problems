package array;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

  public static void main(String[] args) {
    new ValidParenthesis().isValid("{[]}");
  }

  public boolean isValid(String s) {
    Map<Character, Character> maps = new HashMap<>();
    maps.put(')', '(');
    maps.put(']', '[');
    maps.put('}', '{');
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (maps.containsKey(c)) {
        if (stack.empty() || stack.pop() != maps.get(c)) {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.empty();
  }
}
