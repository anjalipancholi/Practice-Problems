package BitManipulation;

public class SortIntegersByTheNumberOfOneBits {

  public int findComplement(int num) {
    String s = Integer.toBinaryString(num);
    s = s.replace("0", "2");
    s = s.replace("1", "0");
    s = s.replace("2", "1");
    return Integer.parseInt(s, 2);
  }
}