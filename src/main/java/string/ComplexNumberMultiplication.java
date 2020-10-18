package string;

/**
 * 537. Complex Number Multiplication
 */
public class ComplexNumberMultiplication {
    /**
     * Immutable Complex Number
     */
    private static class ComplexNumber {
        private final int real;
        private final int imaginary;

        public ComplexNumber(int real, int imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber(String s) {
            String[] split = s.split("\\+");
            this.real = Integer.parseInt(split[0]);
            this.imaginary = Integer.parseInt(split[1].substring(0, split[1].length() - 1));
        }

        public int getReal() {
            return real;
        }

        public int getImaginary() {
            return imaginary;
        }

        public ComplexNumber multiply(ComplexNumber that) {
            return new ComplexNumber(this.real * that.real - this.imaginary * that.imaginary, this.real * that.imaginary + this.imaginary * that.real);
        }

        @Override
        public String toString() {
            return real + "+" + imaginary + "i";
        }
    }

    public String complexNumberMultiply(String a, String b) {
        return new ComplexNumber(a).multiply(new ComplexNumber(b)).toString();
    }

    public static void main(String[] args) {
        System.out.println(new ComplexNumberMultiplication().complexNumberMultiply("1+1i", "1+1i"));
    }
}
