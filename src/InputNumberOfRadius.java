import java.util.Scanner;

public class InputNumberOfRadius {
    int rad;
    public  int inputRad() {

        System.out.println("введите число которое станет радиусом");

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        if (sc.hasNextInt()) {


            rad = sc.nextInt();
            System.out.println("радиус равен" + " "+ rad);

        }
        else {
            System.out.println("вы ввели не число");
        }

return rad;

    }
}
