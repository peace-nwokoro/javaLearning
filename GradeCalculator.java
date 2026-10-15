import java.util.Scanner;

public class GradeCalculator {
    public void Run(Scanner scanner) {
        int score;

        String grade;

        System.out.print("Kindly enter your score ");
        score = scanner.nextInt();

        switch (score) {
            case 90 -> System.out.print("Your grade is: A");
            case 80 -> System.out.print("Your grade is: B");
            case 70 -> System.out.print("Your grade is: C");
            case 60 -> System.out.print("Your grade is: D");
        }
        // Let's use if-else statement

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your final grade is: " + grade);

    }
}
