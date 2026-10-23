import java.util.Scanner;

public class MultiplicationTable {
    public void Run(Scanner scanner) {

        while (true) {

            System.out.println("Enter a number to print its multiplication table (or enter 0 to exit): ");

            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Exiting Multiplication Table...");
                return;
            }

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }

        }
    }
}