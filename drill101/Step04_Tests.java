package drill101;

import java.util.ArrayList;
import java.util.List;

public class Step04_Tests {
    public static void main(String[] args) {

        // テストケース01
        String[] names1 = {"りんご", "みかん", "バナナ"};
        convertAndPrintList(names1);
        // 出力:
        // りんご
        // みかん
        // バナナ

        // テストケース02
        String[] names2 = {"メロン", "ぶどう"};
        convertAndPrintList(names2);
        // 出力:
        // メロン
        // ぶどう
    }

    // ここに convertAndPrintList メソッドを実装する
    public static void convertAndPrintList(String[] names) {
        List<String> list = new ArrayList<String>();
        
        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);
        }

        for (String name : list) {
            System.out.println(name);
        }

    }
}
