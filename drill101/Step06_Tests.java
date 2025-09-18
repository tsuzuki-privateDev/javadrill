package drill101;

import java.util.ArrayList;
import java.util.List;

public class Step06_Tests {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("りんご", 10));
        products.add(new Product("みかん", 5));
        products.add(new Product("バナナ", 3));

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println(p.getName() + "(在庫：" + p.getStock() + ")");
        }
    }
}
