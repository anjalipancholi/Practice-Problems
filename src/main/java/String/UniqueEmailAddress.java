package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

  public int numUniqueEmails(String[] emails) {
    Set<String> set = new HashSet<>();
    for (String i : emails) {
      int j = i.indexOf('@');
      String local = i.substring(0, j);
      String rest = i.substring(j);
      if (local.contains("+")) {
        local = local.substring(0, local.indexOf('+'));
      }
      local = local.replaceAll("\\.", "");
      set.add(local + rest);
    }
    return set.size();
  }
}
