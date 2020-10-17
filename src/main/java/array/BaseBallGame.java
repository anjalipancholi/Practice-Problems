package array;

import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {

            if (ops[i].equals("D")) {
                stack.push(2 * stack.peek());
            } else if (ops[i].equals("C") && !stack.empty()) {
                stack.pop();
            } else if (ops[i].equals("+") && !stack.empty()) {
                int top = stack.pop();
                int n = top + stack.peek();
                stack.push(top);
                stack.push(n);
            } else {
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        for (int i : stack)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        new BaseBallGame().calPoints(new String[]{"\"5\",\"2\",\"C\",\"D\",\"+\""});
    }
}