import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
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
                    case 1 -> {
                        // Should request user to input the number
                        FizzBuzz fb = new FizzBuzz();
                        fb.Run(scanner);
                    }
                    case 2 -> {
                        GradeCalculator gc = new GradeCalculator();
                        gc.Run(scanner);
                    }
                    case 3 -> {
                        MultiplicationTable mt = new MultiplicationTable();
                        mt.Run(scanner);
                    }
                    case 4 -> {
                        Car car = new Car();
                        car.Run(scanner);
                    }
                    case 5 -> {
                        Number number = new Number();
                        number.Run(scanner);
                    }
                    case 6 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choiceee.");
                }
            }
        }
    }

}
