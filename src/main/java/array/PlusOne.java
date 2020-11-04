package array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = carry + digits[i];
            if (i == digits.length - 1) val++;
            if (val > 9) {
                carry = 1;
                digits[i] = 0;
            } else {
                digits[i] = val;
                return digits;
            }
        }
        int[] line = new int[digits.length + 1];
        line[0] = 1;
        return line;
    }
}
