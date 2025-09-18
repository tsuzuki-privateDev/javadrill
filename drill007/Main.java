package drill007;

public class Main {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator(10.0, 9.0);

        double resultAdd = calc.add();
        System.out.println("足し算の結果: " + resultAdd);

        double resultSub = calc.subtract();
        System.out.println("引き算の結果： " + resultSub);
    }
}
