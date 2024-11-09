import java.util.Scanner;

public class Input {
    public static int firstNum;
    public static int secondNum;
    public static int lastNum;

    public static void input() {
        System.out.println("введите три числа");

        Scanner sc = new Scanner(System.in);
        System.out.println("введите первое число");
        if (sc.hasNextInt()) {


            firstNum = sc.nextInt();
            System.out.println("введите второе число");
            secondNum = sc.nextInt();
            System.out.println("введите третье число");
            lastNum = sc.nextInt();

        }
        else {
            System.out.println("вы ввели не число");
        }
        //return firstNum + secondNum + lastNum;


    }


    public int sum(){
        input();
        int first=firstNum;
        int second=secondNum;
        int last=lastNum;
        return first + second + last;
    }


}
