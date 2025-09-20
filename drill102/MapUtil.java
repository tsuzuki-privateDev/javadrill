package drill102;

import java.util.*;

// 要件
// 2種類のMapを使って出力結果を比較すること（HashMapとTreeMap）
// 両方とも for 文で中身を出力すること
// 出力順が異なることを確認すること
// import java.util.*; で TreeMap を利用できる

public class MapUtil {
    public static void compareMapOrder() {
        System.out.println("HashMapでの出力");
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("2023-05-03", "Curry");
        hashMap.put("2023-05-01", "Sushi");
        hashMap.put("2023-05-02", "Pasta");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("---------------");
        System.out.println("TreeMapでの出力");
        Map<String, String> treeMap = new TreeMap<>(hashMap);

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
