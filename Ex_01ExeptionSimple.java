import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_01ExeptionSimple {
    public static void main(String[] args) {
        Scanner scanner =    new Scanner(System.in);

        // int x = scanner.nextInt();
        //  System.out.println( 1 / (x -1) );


        try{
            double x = scanner.nextDouble();

            if (x <= 1) throw new ArithmeticException();

            System.out.printf(" при х = %d y = 1/( x - 1) = %.3f" , x, 1/ (x -1));

        } catch (InputMismatchException e) {
            System.out.println("вы ввели не число");
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя");
        } catch (Exception e) {
            System.out.println("корень из отрицательного числа");
            e.printStackTrace();
        }finally {
            System.out.println("Всё, расчет завершен");
        }
    }


    public static double f(double x) throws IllegalAccessException {
        if (x == 1) throw new ArithmeticException();
        if (x < 1)   throw new IllegalAccessException();
        return 1 / Math.sqrt(x - 1);
    }

}
class MyArifmExcepresstion extends Exception{//hanshof da
    private double x1;

public MyArifmExcepresstion(){super();}
    public MyArifmExcepresstion(String message){super(message);}
    public MyArifmExcepresstion(String message,double x){
        super(message);
        this.x1=x1;
    }
    public String getMessage(){
    String message="";
    if (x1==1)message="in 0 not doing";
    if (x1<1)message="pow is";
    return super.getMessage()+message;
    }



}