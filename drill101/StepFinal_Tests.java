package drill101;

import java.util.ArrayList;

public class StepFinal_Tests {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("りんご", 10));
        products.add(new Product("みかん", 5));
        products.add(new Product("バナナ", 3));

        System.out.println("== 一覧表示 ==");
        ProductUtil.printStockList(products);
        // 出力:
        // りんご (在庫: 10)
        // みかん (在庫: 5)
        // バナナ (在庫: 3)

        System.out.println("\n== 商品検索 ==");
        ProductUtil.searchByName(products, "みかん");
        // 出力: みかんの在庫数: 5

        System.out.println("\n== 在庫が少ない商品を表示（5未満）==");
        ProductUtil.printLowStockProducts(products, 5);
        // 出力:
        // バナナ (在庫: 3)

        System.out.println("\n== 在庫数の更新 ==");
        ProductUtil.updateStockByName(products, "りんご", 15);
        // 出力: りんごの在庫数を15に更新しました

        System.out.println("\n== 存在しない商品の検索・更新 ==");
        ProductUtil.searchByName(products, "パイナップル");
        // 出力: 該当商品なし

        ProductUtil.updateStockByName(products, "パイナップル", 10);
        // 出力: 該当商品なし
    }
}
