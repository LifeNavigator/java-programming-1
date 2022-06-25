
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                total += 1;
                sum += number;
            }
        }
        double average = (float) sum / total;
        if (total == 0) {
            System.out.println("Cannot calculate the average");
        } else  {
            System.out.println(average);
        }
    }
}
