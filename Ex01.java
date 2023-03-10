import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int a = generateRandomValue();
            System.out.println("The random value is: " + a);
            if (x < 0) throw new ArithmeticException();
            System.out.printf("When x <0", x + Math.pow(2.0, Math.sin(1 / x - a) + 4));
            if (x >= 0) throw new ArithmeticException();
            System.out.printf("when x>=0", a * x / Math.sqrt((a * a) - (x * x)));

        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

        public static int generateRandomValue () {
            int a;
            try {
                Random rand = new Random();
                a = rand.nextInt(101) - 50; // Generates a random integer from -50 to 50 (inclusive)
            } catch (Exception e) {
                // Handle any exceptions that may occur during the generation of the random value
                a = 0; // Set a default value in case of an exception
            }
            return a;
        }
    }


