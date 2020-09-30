package array;

import java.util.Objects;
import java.util.Stack;

public class BackSpaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }

        }
        for (int i = 0; i < T.length(); i++) {
            Character c = T.charAt(i);
            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }
        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
        new BackSpaceStringCompare().backspaceCompare("ab#c", "ad#c");
    }
}