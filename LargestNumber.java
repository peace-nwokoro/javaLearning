public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 1};
        int largest = findLargestNumber(numbers);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargestNumber(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
