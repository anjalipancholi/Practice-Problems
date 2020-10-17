package HashTable;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {

  class Employee {

    public int id;
    public int importance;
    public List<Integer> subordinates;
    Map<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
      for (Employee e : employees) {
        map.put(e.id, e);
      }
      return helper(id);
    }

    public int helper(int id) {
      Employee e = map.get(id);
      if (e.subordinates.size() == 0) {
        return e.importance;
      }
      int sum = e.importance;
      for (int i : e.subordinates) {
        sum += helper(i);
      }
      return sum;
    }
  }
}
