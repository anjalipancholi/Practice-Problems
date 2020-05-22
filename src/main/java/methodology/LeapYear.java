package methodology;

import acm.program.ConsoleProgram;

public class LeapYear extends ConsoleProgram {

  @Override
  public void run() {
    println("This program checks for leap year: ");
    int year = readInt("Enter year: ");
    boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    if (isLeapYear) {
      println(year + " is a leap year");
    } else {
      println(year + " is not a leap year.");
    }
  }

  public static void main(String[] args) {
    new LeapYear().start();
  }
}
