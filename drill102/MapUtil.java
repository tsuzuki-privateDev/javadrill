package drill102;

import java.util.*;

public class MapUtil {
    public static void printStoreInventory() {
        Map<String, Map<String, Integer>> storeInventory = new HashMap<>();

        // --- データ登録（Tokyo店） ---
        addStock(storeInventory, "Tokyo", "Apple", 10);
        addStock(storeInventory, "Tokyo", "Banana", 5);

        // --- データ登録（Osaka店） ---
        addStock(storeInventory, "Osaka", "Apple", 7);
        addStock(storeInventory, "Osaka", "Orange", 3);

        // --- 出力 ---
        for (String store : storeInventory.keySet()) {
            System.out.println(store + ": ");
            Map<String, Integer> products = new HashMap<>(storeInventory.get(store));
            for (Map.Entry<String, Integer> entry : products.entrySet()) {
                System.out.println(" " + entry.getKey() + " → " + entry.getValue());
            }
        }
    }

    private static void addStock(Map<String, Map<String, Integer>> inventory, String store, String product, int stock) {
        if (!inventory.containsKey(store)) {
            inventory.put(store, new HashMap<>()); 
        }

        inventory.get(store).put(product, stock);
    }
}
