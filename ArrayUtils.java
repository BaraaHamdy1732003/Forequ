import java.util.Scanner;
import java.util.Random;

public class ArrayUtils {

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
        double[] array = new double[10];

         inputRange(array, 2, 5);

         System.out.println("Array after input :");
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

         fillRandomRange(array, 1, 4);

         System.out.println("Array after filling with random numbers:");
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
