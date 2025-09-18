package drill101;

import java.util.ArrayList;

public class ProductUtil {
    public static void searchByName(ArrayList<Product> products, String keyword) {
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            
            if (p.getName().equals(keyword)) {
                System.out.println(p.getName() + "の在庫数：" + p.getStock());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("該当商品無し" );
        }
    }

    public static void printLowStockProducts(ArrayList<Product> products, int threshold) {
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getStock() < threshold) {
                System.out.println(p.getName() + "(在庫: " + p.getStock() + ")");
            }
        }
    }

    public static void updateStockByName(ArrayList<Product> products, String keyword, int newStock) {
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getName().equals(keyword)) {
                p.setStock(newStock);
                System.out.println(p.getName() + "の在庫数を" + p.getStock() + "に更新しました");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("該当商品なし");
        }
    }
}
