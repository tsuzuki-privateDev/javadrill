package drill007;

public class Main {
    public static void main(String[] args) {
        // 複数のPersonオブジェクトの生成
        Person[] people = new Person[3];
        people[0] = new Person("p1", 15, "male");
        people[1] = new Person("p2", 20, "female");
        people[2] = new Person("p3", 45, "male");

        for(Person p : people) {
            p.displayInfo();
            System.out.println("---------------");
        }
    }
}
