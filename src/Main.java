import java.util.Scanner;

/*
Напиши прогу для сравнения double, float и округления этих типов

Функционал программы
Ввод номера желаемой операции (сравнить/округлить/отбросить дробную часть);
Ввод двух чисел для сравнения (одно double, другое float) или одного (для округления или отброса дробной части);
Вывод результата.
Пример
Операции над double/float
1. Сравнить
2. Округлить
3. Отбросить дробную часть

1 <enter>
Введите первое число:
0.33 <enter>
Введите второе число:
0.33 <enter>
Результат:
числа равны
Процесс реализации
При запуске программы выведем возможные операции над числами с помощью System.out.println

Выберем операцию:

для отброса дробной части — можно привести к типу long;
для сравнения — вычесть одно число из другого и проверить разницу с учётом погрешности; если они оказываются не равны, то указать какое из них больше;
для округления — воспользуемся Math.round(value).
Выведем результат.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static double num1;
    public static float num2;

    public static void main(String[] args) throws Exception {

        actions();


    }


    public static void actions() throws Exception {
//хотел обернуть в беск цикл, чтобы не запускать заново, но возникала ошибка
        while (true) {
            System.out.println("""
                    Операции над double/float нажмите
                   "1. Сравнить" +
                    2. Округлить" +
                    3. Отбросить дробную часть" +
                    "Или введите 'end'""");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Закрываем сканнер...");
                Thread.sleep(300);
                scanner.close();
                System.out.println("Завершаем работу программы");
                Thread.sleep(300);
                break;
            }
            int operation = Integer.parseInt(input);

            switch (operation) {

                case 1 -> {
                    input();
                    compare();
                }
                case 2 -> {
                    input();
                    round();
                }
                case 3 -> {
                    input();
                    diskard();
                }
                default -> System.out.println("Вы ввели не те данные!");

            }
        }

    }

    public static void input() {

        System.out.println("введите два вещественных числа, введите первое");
        num1 = scanner.nextDouble();
        System.out.println("введите второе число");
        num2 = scanner.nextFloat();
        scanner.nextLine();

    }

    public static void compare() {

        //сравнение чисел

        if (Math.abs(num2 - num1) < 0.000001) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }

    }

    public static void round() {

     //"округлить;

        System.out.println(Math.round(num1));
        System.out.println(Math.round(num2));

    }

    public static void diskard() {
        System.out.println("отбросить дробную часть");
        num1 = (long) num1;
        num2 = (long) num2;
        System.out.println(num1);
        System.out.println(num2);


    }

}
