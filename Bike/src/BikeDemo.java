/**
 * 
 */
/**
 * 
 */
// Define an interface for bikes
import java.util.Scanner;

interface Bike {
    void run();
    void breakBike();
    void stop();
    void accelerate();
    void decelerate();
}

class Honda4 implements Bike {
    @Override
    public void run() {
        System.out.println("Honda4 is running safely");
    }

    @Override
    public void breakBike() {
        System.out.println("Honda4 is braking");
    }

    @Override
    public void stop() {
        System.out.println("Honda4 stopped gracefully");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda4 is accelerating");
        // speed + honda
    }

    @Override
    public void decelerate() {
        System.out.println("Honda4 is decelerating");
        // speed - hoda
    }

    public void laneDepartureWarning() {
        System.out.println("Honda4 has a lane departure warning system");
    }
}

class Yamaha implements Bike {
    @Override
    public void run() {
        System.out.println("Yamaha is running smoothly");
    }

    @Override
    public void breakBike() {
        System.out.println("Yamaha is braking");
    }

    @Override
    public void stop() {
        System.out.println("Yamaha stopped gracefully");
    }

    @Override
    public void accelerate() {
        System.out.println("Yamaha is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Yamaha is decelerating");
    }

    public void tractionControl() {
        System.out.println("Yamaha has a traction control system");
    }
}

public class BikeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed for Honda4: ");
        int hondaSpeed = scanner.nextInt();
        System.out.print("Accelerate or decelerate for Honda4? (a/d): ");
        char hondaChoice = scanner.next().charAt(0);
        if (hondaChoice == 'a') {
            new Honda4().accelerate();
        } else {
            new Honda4().decelerate();
        }

        System.out.print("Enter speed for Yamaha: ");
        int yamahaSpeed = scanner.nextInt();
        System.out.print("Accelerate or decelerate for Yamaha? (a/d): ");
        char yamahaChoice = scanner.next().charAt(0);
        if (yamahaChoice == 'a') {
            new Yamaha().accelerate();
        } else {
            new Yamaha().decelerate();
        }

        scanner.close();
    }
}
