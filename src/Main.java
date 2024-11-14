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
   public static Scanner scanner=new Scanner(System.in);
   public static double num1;
   public static float num2;
    public static void main(String[] args) {

actions();



        }
        public static int input(){

            System.out.println("Операции над double/float нажмите\n" +
                    "1. Сравнить\n" +
                    "2. Округлить\n" +
                    "3. Отбросить дробную часть\n");
            int input=scanner.nextInt();
            System.out.println("введите два вещественных числа, введите первое");
            num1= scanner.nextDouble();
            System.out.println("введите второе число");
            num2=scanner.nextFloat();
            scanner.close();
            return input;
        }
        public static void actions(){
//хотел обернуть в беск цикл, чтобы не запускать заново, но возникала ошибка


           switch (input()) {
               case 1 -> compare();
               case 2 -> round();
               case 3 -> diskard();

           }


        }
        public static void compare(){
            System.out.println("сравнение чисел");


            if(Math.abs(num2 - num1) < 0.000001) {
                System.out.println("Числа равны");
            } else {
                System.out.println("Числа не равны");
            }

        }

    public static void round(){
        System.out.println("округлить");
        System.out.println(Math.round(num1));
        System.out.println(Math.round(num2));

    }

    public static void diskard(){
        System.out.println("отбросить дробную часть");
        num1=(long)num1;
        num2=(long)num2;
        System.out.println(num1);
        System.out.println(num2);


    }
//    public static void end(){
//System.exit(-1);
//    }
    }
