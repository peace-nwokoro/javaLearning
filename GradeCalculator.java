public class GradeCalculator {
    public static void main(String[] args) {
        int score= 50;

        String grade;

        switch (score) {
            case 90 -> System.out.print( "Your grade is: A" );
            case 80 -> System.out.print( "Your grade is: B" );
            case 70 -> System.out.print( "Your grade is: C" );
            case 60 -> System.out.print( "Your grade is: D" );
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
    }
}
