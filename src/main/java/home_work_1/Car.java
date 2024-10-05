package home_work_1;
import java.util.Scanner;
public class Car {
    public String carBrand;
    public int currentSpeed;
    public int speed = 0;
    public final int minSpeed = -30;
    public final int maxSpeed = 200;
    Scanner intScanner = new Scanner(System.in);

    public Car(String carBrand, int speed) {
        this.carBrand = carBrand;
        this.currentSpeed = speed;
    }

    public void accelerate() {
        if (speed == 0) {
            speed = currentSpeed;
        }
        System.out.println("How much you want increase speed: ");
        int increaseSpeed = intScanner.nextInt();
        if (increaseSpeed < 0) {
            System.out.println("Can`t be negative");
            return;
        }
        speed += increaseSpeed;

        if (speed > maxSpeed) {
            System.out.println("You can’t reach that speed.");
            return;
        }
        System.out.println("Now your speed is: " + speed + " km/h");
    }

    public void decelerate() {
        if (speed == 0) {
            speed -= currentSpeed;
        }
        System.out.println("How much you want decrease speed: ");
        int decreaseSpeed = intScanner.nextInt();
        if (decreaseSpeed < 0) {
            System.out.println("Can`t be negative");
            return;
        }
        speed -= decreaseSpeed;

        if (speed < minSpeed) {
            System.out.println("You can’t reach that speed.");
            return;
        }
        System.out.println("Now your speed is: " + speed + " km/h");
    }

    public int getSpeed() {
        speed = currentSpeed;
        System.out.println("Now your speed is: " + speed + " km/h");
        return speed;
    }

    public void displayInfo() {
        System.out.println("Your current speed is: " + currentSpeed);
        System.out.println("Now your speed is: " + speed);
    }
}


