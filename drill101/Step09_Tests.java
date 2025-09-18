package drill101;

import java.util.ArrayList;

public class Step09_Tests {
        public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("りんご", 10));
        products.add(new Product("みかん", 5));
        products.add(new Product("バナナ", 3));

        // テストケース01: 存在する商品を更新
        ProductUtil.updateStockByName(products, "りんご", 20);
        // 出力: りんごの在庫数を20に更新しました

        // テストケース02: 存在しない商品を指定
        ProductUtil.updateStockByName(products, "パイナップル", 10);
        // 出力: 該当商品なし
    }
}
