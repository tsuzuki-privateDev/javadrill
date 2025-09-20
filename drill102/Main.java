package drill102;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 要件
// Map<String, Integer> を使って、商品ごとの注文数をカウントすること
// すでにカウントがある場合は +1、なければ初期値1をセットすること
// for 文でループして処理すること（Stream APIは使用禁止）

public class Main {
    public static void main(String[] args) {
        List<String> orders = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> orderMap = new HashMap<>();

        for (String order : orders) {
            if (!orderMap.containsKey(order)) {
                orderMap.put(order, 1);
            } else {
                int count = orderMap.get(order);
                orderMap.put(order, count + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
