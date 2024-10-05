package home_work_1;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 90);
        car.accelerate();
        car.decelerate();
        System.out.println(car.getSpeed());
        car.displayInfo();
    }
}
