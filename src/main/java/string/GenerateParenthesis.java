package string;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        return generateParenthesisRecursively(n);
    }

    private List<String> generateParenthesisRecursively(int N) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper("", N, result);
        return result;
    }

    private void generateParenthesisHelper(String s, int N, List<String> result) {
        if (!isValid(s, N) || s.length() > 2 * N) return;
        generateParenthesisHelper(s + "(", N, result);
        generateParenthesisHelper(s + ")", N, result);
        if (s.length() == 2 * N) result.add(s);
    }

    private List<String> generateParenthesisIteratively(int N) {
        List<String> previous = new ArrayList<>();
        List<String> current = new ArrayList<>();
        current.add("");
        for (int i = 0; i < 2 * N; i++) {
            previous = current;
            current = new ArrayList<>();
            for (String s : previous) {
                if (isValid(s + "(", N)) {
                    current.add(s + "(");
                }
                if (isValid(s + ")", N)) {
                    current.add(s + ")");
                }
            }
        }
        return current;
    }


    private boolean isValid(String s, int N) {
        int openCount = 0;
        int totalOpen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
                totalOpen++;
            } else if (s.charAt(i) == ')') openCount--;
            else throw new IllegalArgumentException("Invalid Character: String should contain either ( or )");
            if (openCount < 0 || totalOpen > N) return false;
        }
        return openCount <= N;
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(2));
    }
}
