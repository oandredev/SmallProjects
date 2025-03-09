import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;

        System.out.println("Write value A (Different from 0): \n");

        a = userInput.nextDouble();

        if (a != 0) {
            System.out.println("Write value B: \n");

            b = userInput.nextDouble();

            System.out.println("Write value C: \n");

            c = userInput.nextDouble();

            // x = (-b ± √(b²-4ac)) / (2a)

            delta = (b * b) - 4 * a * c;

            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("S { x1 = %.3f e x2 = %.3f }\n", x1, x2);
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.printf("S { x = %.3f }\n", x1); // Only show X1 because Delta is 0
            } else {
                System.out.println("Delta is a Invalid Number");
            }

        } else {
            System.out.println("Value A cannot be 0");
        }

        userInput.close();
    }
}