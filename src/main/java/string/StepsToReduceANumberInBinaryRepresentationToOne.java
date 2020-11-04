package string;

public class StepsToReduceANumberInBinaryRepresentationToOne {
    public int numSteps(String s) {
        int steps = 0;
        int number = Integer.parseInt(s, 2);
        if (number == 1) {
            return 0;
        }
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else if (number % 2 != 0) {
                number += 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(new StepsToReduceANumberInBinaryRepresentationToOne().numSteps("1101"));
    }
}

