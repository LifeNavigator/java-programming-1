
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = scanner.nextLine();

        System.out.println("Give an integer:");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Give a double:");
        double floatingPoint = Double.parseDouble(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);

    }
}
