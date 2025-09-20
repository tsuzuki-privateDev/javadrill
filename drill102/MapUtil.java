package drill102;

import java.util.*;

public class MapUtil {
    public static void findProductIdByName(String product) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101,"Apple");
        map.put(102, "Banana");
        map.put(103, "Orange");

        boolean flag = false;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(product)) {
                System.out.println("商品ID: " + entry.getKey());
                flag = true;
                break;
            }
        }

        if (!flag) System.out.println("見つかりませんでした。");
    }
}
