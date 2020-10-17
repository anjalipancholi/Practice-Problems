package String;

import java.util.Stack;

public class reverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.add(c);
            }
        }
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(stack.pop());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
