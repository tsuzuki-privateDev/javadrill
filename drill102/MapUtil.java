package drill102;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static void putMember() {
        Map<Integer, String> memberMap = new HashMap<>();

        memberMap.put(101, "Yamada");
        memberMap.put(102, "Tanaka");
        memberMap.put(101, "Suzuki");   // key[101]がすでにあるので、値が上書きされる

        for (Map.Entry<Integer, String> entry : memberMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
