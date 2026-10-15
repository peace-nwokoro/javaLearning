import java.util.Scanner;

public class Car {
    String brand;
    String model;
    String color;
    int year;

    public void Run(Scanner scanner) {
        Car mycar = new Car();

        System.out.print("Enter the brand of the car: ");
        mycar.brand = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        mycar.model = scanner.nextLine();

        System.out.print("Enter the color of the car: ");
        mycar.color = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        mycar.year = scanner.nextInt();

        System.out.println(
                "You are driving a " + mycar.year + " " + mycar.color + " " + mycar.brand + " " + mycar.model);

        mycar.drive();

    }

    public void drive() {
        System.out.println("The car is driving");
    }
}