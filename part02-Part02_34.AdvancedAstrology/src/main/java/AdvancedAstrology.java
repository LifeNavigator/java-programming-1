
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = size - 1, j = 1; i >= 0 && j <= size; i--, j++) {
            printSpaces(i);
            printStars(j);
        }
    }

    public static void christmasTree(int height) {
        int stars = 1;
        int space = height - 1;

        /*We using while loop because we can increment number of
         stars indefinitely based on size
         */
        while (stars >= 0 && space >= 0) {
            printSpaces(space);
            printStars(stars);
            stars += 2;
            space--;
        }
        int tree = 0;

        while (tree < 2) {
            printSpaces(height - 2);
            printStars(3);
            tree++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
