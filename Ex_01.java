import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("x =");
                double x = scanner.nextDouble();
                double y = func(x);
                System.out.println("x=" + x + "y=" + y);
            }
        } catch (InputMismatchException e) {
            System.out.println("input is not a number");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("unknown error");
        }
    }
    public static double func ( double x) throws IllegalAccessException {
        double a = Math.random() * 101 - 50;

        if (x < 0) {
            if (x == a) throw new IllegalAccessException("Zero in denominator");
            return x + Math.pow(Math.sin(1.0 / (x - a) + 4.0), 2.0);
        } else {
            if (x >= a) throw new IllegalAccessException("Square of negative or division by 0  ");
            return a * x / Math.sqrt(a * a - x * x);
        }
    }
}