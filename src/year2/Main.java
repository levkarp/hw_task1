package year2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    int year;
    int daysInput;
    int count;
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ;

        Main main = new Main();
        main.testResult();


    }


//    public int inputYear()  {
//
//            System.out.println("введите год в формате 'yyyy'");
//            year = sc.nextInt();
//                 System.out.println(year);
//      //  sc.close();
//        return year;
//    }


//    public int inputDays()  {
//
//
//               System.out.println("введите число дней в этом году'");
//        daysInput = sc.nextInt();
//        System.out.println(daysInput);
//     //   sc.close();
//               return daysInput;
//    }

    public void testResult() {
        while (true) {
            System.out.println("введите год в формате 'yyyy'");
            year = sc.nextInt();
            System.out.println(year);
            System.out.println("введите число дней в этом году'");
            daysInput = sc.nextInt();
            System.out.println(daysInput);

            if ((year % 4 == 0 && year % 100 == 0) && daysInput == 366) {
                count++;
            } else if ((year % 4 != 0 && year % 100 != 0) && daysInput == 365) {
                count++;
            } else {
                System.out.println("Не правильно в этом году не" + " " + daysInput);
                System.out.println("Набрано очков" + " " + count);
                break;
            }


        }

    }


}









