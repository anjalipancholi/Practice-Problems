package String;

public class RotatedDigits {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int n = i;
            boolean isValid = true, isGood = false;
            while (n > 0) {
                int d = n % 10;
                n /= 10;
                if (d == 3 || d == 4 || d == 7) {
                    isValid = false;
                    break;
                } else if (d == 2 || d == 5 || d == 6 || d == 9)
                    isGood = true;
            }

            if (isValid && isGood)
                count++;
        }
        return count;
    }
}
