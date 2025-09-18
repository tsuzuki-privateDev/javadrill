package drill101;

public class Step05_Tests {
    public static void main(String[] args) {
        Product p1 = new Product("りんご", 10);
        Product p2 = new Product("みかん", 5);

        System.out.println(p1.getName() + " (在庫: " + p1.getStock() + ")");
        // 出力: りんご (在庫: 10)

        System.out.println(p2.getName() + " (在庫: " + p2.getStock() + ")");
        // 出力: みかん (在庫: 5)
    }
}
