package year2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int year;
    static int daysInput;
    static int count = 0;
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        testResult();


    }




    public static void testResult() {
        while (true) {
            input();

            if (determinatonYear() == daysInput) {
                count++;

            } else {
                System.out.println("Упс, ошибка!!! В этом году " + determinatonYear() + " дней. " +
                        "Ты набрал " + count + " очков!");
                break;
            }

        }


    }

    public static void input() {

        System.out.println("введите год в формате 'yyyy' и количество дней");
        year = sc.nextInt();

        daysInput = sc.nextInt();

    }

    public static int determinatonYear() {
        int days;
        if (year % 400 == 0) {

            days = 366;
        } else if (year % 4 == 0 && year % 100 != 0) {

            days = 366;
        } else {

            days = 365;
        }
        return days;
    }


}









