package drill007;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("普通車", "黒");

        c.accelerate(20);
        c.displaySpeed();

        c.decelerate(50);
        c.displaySpeed();
    }
}
