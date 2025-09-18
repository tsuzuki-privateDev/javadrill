package drill007;

public class Calculator {
    private double num1;
    private double num2;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
         return this.num1 + this.num2;
    }

    public double subtract() {
        return num1 - num2;
    }
}
