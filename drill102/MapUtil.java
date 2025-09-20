package drill102;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static void putMember() {
        Map<Integer, String> memberMap = new HashMap<>();

        memberMap.put(2001, "Sales");
        memberMap.put(2002, "HR");
        memberMap.put(2003, "Engineering");   // key[101]がすでにあるので、値が上書きされる

        System.out.println("----------------");
        System.out.println("keySet()を使って出力");
        System.out.println("----------------");
        for (Integer key : memberMap.keySet()) {
            String value = memberMap.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println("----------------");
        System.out.println("entrySet()を使って出力");
        System.out.println("----------------");
        for (Map.Entry<Integer, String> entry : memberMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
