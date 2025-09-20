package drill102;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtil {
    public static void mapUtilMain() {
        // カテゴリごとに複数の商品を登録するマップ
        Map<String, List<String>> categoryMap = new HashMap<>();

        addProduct(categoryMap, "Food", "Apple");
        addProduct(categoryMap, "Food", "Banana");
        addProduct(categoryMap, "Clothing", "T-shirt");
        addProduct(categoryMap, "Clothing", "Jeans");
        addProduct(categoryMap, "Food", "Orange");

        for (String category : categoryMap.keySet()) {
            System.out.println(category);
            for (String product : categoryMap.get(category)) {
                System.out.println("- " + product);
            }
            System.out.println("---------------");
        }
    }

    private static void addProduct(Map<String, List<String>> map, String category, String product) {
        // カテゴリが既に登録されているかチェックして、なければ値がリストを作成し、putする
        if (!map.containsKey(category)) {
            map.put(category, new ArrayList<>());
        }
        map.get(category).add(product);
    }
}
