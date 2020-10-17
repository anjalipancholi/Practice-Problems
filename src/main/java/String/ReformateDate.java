package String;

import java.util.HashMap;
import java.util.Map;

public class ReformateDate {

  public static void main(String[] args) {
    new ReformateDate().reformatDate("20th Oct 2052");
  }

  public String reformatDate(String date) {
    Map<String, String> month = new HashMap<>();
    month.put("Jan", "01");
    month.put("Feb", "02");
    month.put("Mar", "03");
    month.put("Apr", "04");
    month.put("May", "05");
    month.put("Jun", "06");
    month.put("Jul", "07");
    month.put("Aug", "08");
    month.put("Sep", "09");
    month.put("Oct", "10");
    month.put("Nov", "11");
    month.put("Dec", "12");
    String[] format = date.split(" ");
    String givenDay = format[0];
    String givenMonth = format[1];
    String givenYear = format[2];
        /* to change the format of the day ,if the date is from 1st to 9th then we need to add '0' in the prefix
         and add only digits from the given day
         * */
    String updatedDay = "";
    if (givenDay.length() == 3) {
      updatedDay += '0' + givenDay.substring(0, 1);
    } else {
      updatedDay += givenDay.substring(0, 2);
    }
    String updatedMonth = month.get(givenMonth);

    StringBuilder sb = new StringBuilder();
    sb.append(givenYear).append("-").append(updatedMonth).append("-").append(updatedDay);
    System.out.println(sb.toString());
    return sb.toString();

  }
}
