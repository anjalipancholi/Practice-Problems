package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 */
public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        List<Integer> negativeList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) stack.pop();
                else negativeList.add(i);
            }
        }

        while (!stack.isEmpty()) negativeList.add(stack.pop());

        for (int i = 0; i < s.length(); i++) {
            if (!negativeList.contains(i)) sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new MinimumRemoveToMakeValidParentheses().minRemoveToMakeValid("))(("));
    }
}
