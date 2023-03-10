import java.util.Scanner;
import java.util.Random;

public class Ex04 {

    public static void inputRange(double[] array, int k1, int k2) {
        Scanner scanner = new Scanner(System.in);
        for (int i = k1; i <= k2; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextDouble();
        }
    }

    public static void fillRandomRange(double[] array, int k1, int k2) {
        Random random = new Random();
        for (int i = k1; i <= k2; i++) {
            array[i] = random.nextDouble();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
             System.out.print("Enter k1: ");
            int k1 = scanner.nextInt();

            System.out.print("Enter k2: ");
            int k2 = scanner.nextInt();

            System.out.print("Enter n: ");
            int n = scanner.nextInt();

             double[] x = new double[n];

             inputRange(x, k1, k2);

             fillRandomRange(x, 0, k1-1);
            fillRandomRange(x, k2+1, n-1);

             System.out.println(" x:");
            for (double value : x) {
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error !  " + e.getMessage());
        }
    }
}
