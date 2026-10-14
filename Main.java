import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 6) {
            System.out.println("--------------------------------");
            System.out.println("Welcome to java practice Hub");
            System.out.println("--------------------------------");

            System.out.println("1. FizzBuzz");
            System.out.println("2. Grade Calculator");
            System.out.println("3. Multiplication Table");
            System.out.println("4. Car");
            System.out.println("5. Even/Odd Number");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            System.out.println("You selected option: " + choice);

            switch (choice) {
                case 1:
                    FizzBuzz.fizzBuzz();
                    break;
                case 2:
                    GradeCalculator.Gradecalculator();
                    break;
                case 3:
                    MultipicationTable.multiplicationTable();
                    break;
                case 4:
                    Car.mycar();
                    break;
                case 5:
                    Number.EvenorOdd();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choiceee.");
            }
        }
        

        scanner.close();
    }
    
}
