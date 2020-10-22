package string;

import java.util.Stack;

/**
 * 856. Score of Parentheses
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' && S.charAt(i + 1) == ')') {
                count++;
                i++;
            } else if (S.charAt(i) == '(') {
                stack.push(count);
                count = 0;
            } else {
                count = 2 * count + stack.pop();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new ScoreOfParentheses().scoreOfParentheses("(()(()))"));
    }
}
