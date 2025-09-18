package drill101;

import java.util.Arrays;

public class Step02_Tests {
    public static void main(String[] args) {

        // テストケース01
        int[] stocks1 = {10, 5, 3, 0, 8};
        checkOutOfStock(stocks1);
        // 出力: "在庫切れあり"

        // テストケース02
        int[] stocks2 = {1, 2, 3};
        checkOutOfStock(stocks2);
        // 出力: "在庫切れなし"

        // テストケース03
        int[] stocks3 = {0, 0, 0};
        checkOutOfStock(stocks3);
        // 出力: "在庫切れあり"
    }

    // ここに checkOutOfStock メソッドを実装する
    public static void checkOutOfStock(int[] stocks) {

        boolean hasOutOfStock = false;
        for (int stock : stocks) {
            if (stock == 0) {
                hasOutOfStock = true;
                break;
            }
        }
        
        if (hasOutOfStock) {
            System.out.println("在庫切れあり");
        } else {
            System.out.println("在庫切れなし");
        }
    }
}
