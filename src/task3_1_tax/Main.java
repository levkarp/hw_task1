package task3_1_tax;

import java.util.Scanner;

public class Main {
    public static int earningsInput;//Доход сканер
    public static int spendingInput;//Расход скан
    public static int earnings;
    public static int spending;
    public static int operation;
    public static String input;
    public static int taxEarnings;
    public static int taxEarnSpend;
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            printOperation();
            input = sc.nextLine();
            if (input.equals("end")){
                break;
            }
            operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    inputForEarnings();

                    System.out.println("доход теперь=" + " " + countEarn());
                    break;

                case 2:
                    inputForSpending();
                    System.out.println("раасход теперь=" + " " + countSpend());

                    break;
                case 3:
                    inputForCalculation();
                    break;

                default: System.out.println("Такой операции нет!");
            }

        }
    }

    public static void printOperation() {

        System.out.println("""
               
                Введите опреацию:
                1 - указать доход
                2 - указать расход
                3 - рассчитать налоги
                end -выход
                """);


    }

    public static void inputForCalculation() {
        if (earnings > spending) {


            taxEarnings = (earnings * 6) / 100;
            taxEarnSpend = ((earnings - spending) * 15) / 100;

            System.out.println("налог по ставке УСН доходы=" + " " + taxEarnings);
            System.out.println("налог по ставке УСН доходы минус расходы=" + " " + taxEarnSpend);
            compareTax();
        } else {
            System.out.println("для расчета налогов доходы должны быть больше расходов");
        }

    }

    public static void compareTax() {
        int taxResult;
        if (taxEarnings > taxEarnSpend) {
            taxResult = taxEarnings - taxEarnSpend;
            System.out.println("УСН по ставке доходы 6% выгоднее на" + " " + taxResult + " " + "рублей");
        } else {
            taxResult = taxEarnSpend - taxEarnings;
            System.out.println("УСН по ставке доходы минус расходы выгоднее " +
                    "на" + " " + taxResult + " " + "рублей");
        }
    }

    public static void inputForEarnings() {
        System.out.println("введите доход");
        earningsInput = Integer.parseInt(sc.nextLine());

    }

    public static int countEarn() {
        earnings += earningsInput;

        return earnings;
    }

    public static int countSpend() {
        spending += spendingInput;

        return spending;
    }


    public static void inputForSpending() {
        System.out.println("введите расход");
        spendingInput = Integer.parseInt(sc.nextLine());

    }


}
