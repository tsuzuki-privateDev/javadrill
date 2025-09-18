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
}
