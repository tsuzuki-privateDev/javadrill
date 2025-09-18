package drill101;

public class Step01_Tests {
    public static void main(String[] args) {

        // テストケース01
        int[] stocks1 = {10, 5, 3, 0, 8};
        printStockSum(stocks1);
        // 出力: "合計在庫数: 26"

        // テストケース02
        int[] stocks2 = {0, 0, 0};
        printStockSum(stocks2);
        // 出力: "合計在庫数: 0"

        // テストケース03
        int[] stocks3 = {100};
        printStockSum(stocks3);
        // 出力: "合計在庫数: 100"
    }

    public static void printStockSum(int[] stocks) {
        int result = 0;

        for (int i = 0; i < stocks.length; i++) {
            result += stocks[i];
        }

        System.out.println(result);
    }
}
