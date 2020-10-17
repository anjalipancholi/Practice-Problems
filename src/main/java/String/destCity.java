package String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class destCity {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> i : paths) {
            map.put(i.get(0), i.get(1));
        }
        String city = map.keySet().iterator().next();
        while (map.containsKey(city)) {
            city = map.get(city);
        }
        return city;
    }
}
