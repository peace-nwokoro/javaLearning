import java.util.Scanner;

public class FizzBuzz {
    public void Run(Scanner scanner) {

        int number;
        System.out.print("Enter a number to check if it is Fizz, Buzz, or FizzBuzz: ");
        number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " FizzBuzz");
        }

        else if (number % 3 == 0) {
            System.out.println(number + " Fizz");
        }

        else if (number % 5 == 0) {
            System.out.println(number + " Buzz");
        }

        else {
            System.out.println(number);
        }

    }
}