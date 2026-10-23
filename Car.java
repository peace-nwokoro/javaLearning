import java.util.Scanner;

public class Car {
    String brand;
    String model;
    String color;
    int year;

    public void Run(Scanner scanner) {
        while (true) {
            Car mycar = new Car();

            System.out.print("Enter the brand of the car: ");
            mycar.brand = scanner.nextLine();

            System.out.print("Enter the model of the car: ");
            mycar.model = scanner.nextLine();

            System.out.print("Enter the color of the car: ");
            mycar.color = scanner.nextLine();

            System.out.print("Enter the year of the car: ");
            mycar.year = scanner.nextInt();
            scanner.nextLine();

            System.out.println(
                    "You are driving a " + mycar.year + " " + mycar.color + " " + mycar.brand + " " + mycar.model);

            mycar.parked();
            System.out.print("Do you want to enter another car? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Exiting Car Program...");
                break;
            }
        }
    }

    public void parked() {
        System.out.println("The car is parked");
    }
}