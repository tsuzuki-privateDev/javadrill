package drill101;

public class Step03_Tests {
    public static void main(String[] args) {

        // テストケース01
        String[] names1 = {"りんご", "みかん", "バナナ"};
        int[] stocks1 = {10, 5, 3};
        printStockList(names1, stocks1);
        // 出力:
        // りんご: 10
        // みかん: 5
        // バナナ: 3

        // テストケース02
        String[] names2 = {"メロン", "ぶどう"};
        int[] stocks2 = {0, 8};
        printStockList(names2, stocks2);
        // 出力:
        // メロン: 0
        // ぶどう: 8
    }

    // ここに printStockList メソッドを実装する
    public static void printStockList(String[] names, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + stocks[i]);
        }
    }
}
