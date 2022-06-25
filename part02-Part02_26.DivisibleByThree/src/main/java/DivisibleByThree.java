
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;

        while (true) {
            System.out.println("Input a number");
            numerator = Integer.parseInt(scanner.nextLine());
            if (numerator >= 0) {
                System.out.println("Great! Please input a second number");
                denominator = Integer.parseInt(scanner.nextLine());
                if (denominator > numerator){
                    break;
                } else {
                    System.out.println("Uh oh, number must be > 0 nad bigger than first number");
                }
            }
        }

        divisibleByThreeInRange(numerator, denominator);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if ( i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
