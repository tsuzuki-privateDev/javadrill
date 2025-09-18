package drill101;

import java.util.ArrayList;

public class Step08_Tests {
        public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("りんご", 10));
        products.add(new Product("みかん", 5));
        products.add(new Product("バナナ", 3));

        // テストケース01: 閾値5未満
        ProductUtil.printLowStockProducts(products, 5);
        // 出力:
        // バナナ (在庫: 3)

        // テストケース02: 閾値11未満
        ProductUtil.printLowStockProducts(products, 11);
        // 出力:
        // りんご (在庫: 10)
        // みかん (在庫: 5)
        // バナナ (在庫: 3)

        // テストケース03: 閾値3未満
        ProductUtil.printLowStockProducts(products, 3);
        // 出力なし
    }
}
