import java.util.Scanner;

public class FizzBuzz {
    public void Run(Scanner scanner) {

        int number;

        while (true) {
            System.out.print("Enter a number to check(0 to exit): ");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Exiting FizzBuzz...");
                break;
            }

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println(number + " Fizz");
            } else if (number % 5 == 0) {
                System.out.println(number + " Buzz");
            } else {
                System.out.println(number);
            }
        }
    }

}
