import java.util.Scanner;

public class MultipicationTable {
    public static void multiplicationTable() {

        System.out.println("Enter a number to print its multiplication table: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

    }
}