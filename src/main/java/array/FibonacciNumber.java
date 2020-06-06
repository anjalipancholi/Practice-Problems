package array;

public class FibonacciNumber {

    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int answer = fib(N - 1) + fib(N - 2);

        return answer;

    }

}





