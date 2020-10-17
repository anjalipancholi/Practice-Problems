package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveOuterMostParenthesis {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char parentheses = S.charAt(i);
            if (parentheses == '(') {
                if (!stack.isEmpty())
                    result.append(parentheses);
                stack.push(parentheses);
            } else if (parentheses == ')') {
                stack.pop();
                if (!stack.isEmpty())
                    result.append(parentheses);
            }
        }
        System.out.println(result);
        return result.toString();
    }

    public static void main(String[] args) {
        new RemoveOuterMostParenthesis().removeOuterParentheses("(()())");
    }
}
