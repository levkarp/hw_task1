package year1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    int year;

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.input();
        main.determinatonYear();

    }

    public int input() throws Exception {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("введите год в формате 'yyyy'");
            year = sc.nextInt();
            System.out.println(year);
        } catch (InputMismatchException exception) {
            System.out.println("вы ввели не число в формате 'yyyy'");

        }

        return year;
    }

    public void determinatonYear() {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("год високосный");
            System.out.println(366);
        } else {
            System.out.println("год не високосный");
            System.out.println(365);
        }

    }
}

