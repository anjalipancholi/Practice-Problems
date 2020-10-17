package String;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int tempCount = 0;
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                tempCount++;
            }
            if (s.charAt(i) == ')') {
                stack.pop();
                if (tempCount > count) {
                    count = tempCount;
                }
                tempCount--;
            }
        }
        if(!stack.isEmpty()){
            return 0;
        }
        return count;
    }
}
