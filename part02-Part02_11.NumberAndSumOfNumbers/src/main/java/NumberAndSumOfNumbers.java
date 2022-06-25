
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sumNumber = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                total = total + 1;
                sumNumber = sumNumber + number;
            }
        }
        System.out.println("Number of numbers: " + total);
        System.out.println("Sum of the numbers: " + sumNumber);
    }
}
