import java.util.Scanner;

public class MultiplicationTable {
    public void Run(Scanner scanner) {

        System.out.println("Enter a number to print its multiplication table: ");

        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

    }
}