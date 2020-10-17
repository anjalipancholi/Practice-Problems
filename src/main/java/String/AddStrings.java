package String;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j)-'0';
                j--;
            }
            sum += carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        new AddStrings().addStrings("1234", "12");
    }
}
