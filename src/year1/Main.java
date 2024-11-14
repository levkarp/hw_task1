package year1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int year;

    public static void main(String[] args)  {

        inputYear();
        determinatonYear();

    }

    public static void inputYear() {


        Scanner sc = new Scanner(System.in);
        System.out.println("введите год в формате 'yyyy'");
        year = sc.nextInt();
        System.out.println(year);



    }

    public static void determinatonYear() {
        if (year % 400 == 0) {
            System.out.println("год високосный");
            System.out.println(366);
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("год високосный");
            System.out.println(366);
        } else {
            System.out.println("год не високосный");
            System.out.println(365);
        }

    }
}

