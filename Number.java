import java.util.Scanner;

public class Number {
    public void Run(Scanner scanner) {
        while (true) {

            System.out.println("Enter a number to check if it is even or odd (0 to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Exiting Even/Odd Number Program...");
                return;
            }

            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }

        }

    }
}
