
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.parseInt(scanner.nextLine());

            if (userNumber == 0) {
                break;
            } else {
                number += userNumber;
            }
        }
        System.out.println("Sum of the numbers: " + number);
    }
}
