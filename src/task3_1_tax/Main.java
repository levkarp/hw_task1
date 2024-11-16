package task3_1_tax;

import java.util.Scanner;

public class Main {
    public static int earningsInput;
    public static int spendingInput;
    public static int earnings;
    public static int spending;
    public static int operation;
    public static String input;
    public static int taxEarnings;
    public static int taxEarnSpend;
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            inputOperation();
            switch (operation) {
                case 1:
                    inputForEarnings();
                    //  earnings+=countEarn();

                    System.out.println("доход теперь=" + " " + countEarn());
                    break;

                case 2:
                    inputForSpending();
                    System.out.println("раасход теперь=" + " " + countSpend());
                    ;
                    break;
                case 3:
                    inputForCalculation();
                    break;

//          case 4:
//          System.exit(-1);
//              break;


            }


        }
        /*
        > Мурат:
ДОМАШНЕЕ ЗАДАНИЕ:
ИПшник
ВАЖНО: Перед показом домашнего задания, убедись, что ты соблюдаешь все правила форматирования
 кода: от правила именований, до пробелов и отступов (последнее можно исправлять автоматически в
  идее через Code -> Reformat code).


Нужно написать программу-помощника индивидуальному предпринимателю (далее - ИП),
 которая помогает ему выбрать лучшую систему налогооблажения. ИП будет
 заносить суммы доходов и расходов, а программа будет выбирать для него лучшую
 систему налогообложения из двух:

УСН доходы - налог 6% от доходов;
УСН доходы минус расходы - налог 15% от разницы доходов и расходов.
Функционал программы
Ввод сумм доходов и расходов ИП;
ИП может несколько раз вносить доходы и расходы, они должны суммироваться с введёнными
ранее данными;
При выборе ИП опции определения наиболее выгодной системы налогообложения, программа
должна вывести название такой системы (УСН доходы или УСН доходы минус расходы);
При выводе самой выгодной системы налогооблажения, программа должна вывести также сумму,
 которую удастся сэкономить, если выбрать эту систему;
Программа должна завершаться при вводе слова end;
Нужно помнить, что налог не может быть отрицательным;
Программа должна быть структурирована в методы (например, расчёт налога для одной системы
 налогооблажения должен представлять собой отдельный статический метод)
Пример
Выберите операцию и введите её номер:
1. Добавить новый доход
2. Добавить новый расход
3. Выбрать ситему налогооблажения
1 <Enter>
Введите сумму дохода:
400 <Enter>

Выберите операцию и введите её номер:
1. Добавить новый доход
2. Добавить новый расход
3. Выбрать ситему налогооблажения
2 <Enter>
Введите сумму расхода:
100 <Enter>

Выберите операцию и введите её номер:
1. Добавить новый доход
2. Добавить новый расход
3. Выбрать ситему налогооблажения
1 <Enter>
Введите сумму дохода:
600 <Enter>

Выберите операцию и введите её номер:
1. Добавить новый доход
2. Добавить новый расход
3. Выбрать ситему налогооблажения
3 <Enter>

Мы советуем вам УСН доходы
Ваш налог составит: 60 рублей
Налог на другой системе: 135 рублей
Экономия: 75 рублей

Выберите операцию и введите её номер:
1. Добавить новый доход
2. Добавить новый расход
3. Выбрать ситему налогооблажения
end <Enter>

Программа завершена!
Такой вывод программы основан на следующих расчётах:

Доходы ИП: 400 + 600 = 1000 рублей
Расходы ИП: 100 рублей
УСН доходы: 6% от 1000 рублей = 60 рублей
УСН доходы минус расходы: 15% от 1000-100 рублей = 135 рублей
Экономия: 135 - 60 = 75 рублей
Возможно нужен будет цикл.

//Цикл будет работать, пока пользователь не введет end

Заведи переменные для хранения доходов и расходов. При вводе новых доходов и расходов
увеличивайте их на введённое число:

   int earnings = 0;    // доходы
   int spendings = 0;   // расходы
Если пользователь ввёл номер операции, то превращаешь текст в число и делаем по нему свич:

int operation = Integer.parseInt(input);
switch (operation) {
   case 1:
    .....
   case 2:
      .....
      ...
      break;
   case 3::
      // действия при выборе второй операции
      ...
      break;
   default:
      System.out.println("Такой операции нет");
}
Для каждой системы налогооблажения напиши метод, рассчитывающий налог. Не забудь
что налог отрицательным быть не может:

public static int taxEarningsMinusSpendings(int earnings, int spendings) {
//один раз оставлю тебе часть решения...))
   int tax = (earnings - spendings) * 15 / 100;
   if (tax >= 0) {
      return tax;
   } else {
    ???
   }
}
В коде выбора лучшей системы налогооблажения рассчитайте налоги для каждой системы.
Сравните полуенные значения, выберите условным оператором лучшую и выведите на экран
 всю необходимую ИП информацию.

Выведите результат работы на экран.

         */
    }

    public static int inputOperation() {

        System.out.println("Введите опреацию: 1-указать доход," +
                " 2 - указать расход, 3 - рассчитать налоги, end -выход ");
        input = sc.nextLine();
        operation = Integer.parseInt(input);
        return operation;
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

    public static int inputForEarnings() {
        System.out.println("введите доход");
        earningsInput = Integer.parseInt(sc.nextLine());

        return earningsInput;
    }

    public static int countEarn() {
        earnings += earningsInput;

        return earnings;
    }

    public static int countSpend() {
        spending += spendingInput;

        return spending;
    }


    public static int inputForSpending() {
        System.out.println("введите расход");
        spendingInput = Integer.parseInt(sc.nextLine());

        return spendingInput;
    }

//    public static int systemExit(){
//        System.out.println("для завершеня программы нажмите 'end'");
//        int exit;
//        exit=Integer.parseInt(sc.nextLine());
//
//        return exit;
//    }


}
