package string;

public class AddBinary {

  public static void main(String[] args) {
    new AddBinary().addBinary("11", "1");
  }

  public String addBinary(String a, String b) {
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    StringBuffer sb = new StringBuffer();
    while (i >= 0 || j >= 0) {
      int sum = 0;
      if (i >= 0) {
        sum += a.charAt(i) - '0';
        i--;
      }
      if (j >= 0) {
        sum += b.charAt(i) - '0';
        j--;
      }
      sum += carry;
      sb.append(sum % 2);
      carry = sum / 2;
    }
    if (carry > 0) {
      sb.append(carry);
    }
    System.out.println(sb.reverse().toString());
    return sb.reverse().toString();
  }

}
