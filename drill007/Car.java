package drill007;

public class Car {
    private String model;
    private String color;
    private int speed;
    
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // スピードを加速する
    public void accelerate(int speedIncrease) {
        this.speed += speedIncrease;
    }

    // スピードを減速する
    public void decelerate(int speedDecrease) {
        if (speed - speedDecrease >= 0) {
            this.speed -= speedDecrease;
        } else {
            this.speed = 0;
        }

    }

    public void displaySpeed() {
        System.out.println("Speed: " + speed + "km/h");
    }
}
