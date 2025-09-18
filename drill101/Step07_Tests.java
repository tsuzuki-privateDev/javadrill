package drill101;

import java.util.ArrayList;

public class Step07_Tests {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("りんご", 10));
        products.add(new Product("みかん", 5));
        products.add(new Product("バナナ", 3));

        // テストケース01
        ProductUtil.searchByName(products, "みかん");
        // 出力: みかんの在庫数: 5

        // テストケース02
        ProductUtil.searchByName(products, "パイナップル");
        // 出力: 該当商品なし
    }
}
