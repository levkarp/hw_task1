
/*
Спросить у Мурата:
хотел сделать наследование ИнпутРадиуса от Инпут и переопределиить метод, чтобы
повторно не писать счит, но там статич метод
когда разумно статич методы, а когда нет?
почему не видел класс Круг, когда он был в отдельном пакете?
Тоже самое для Инпута, когда хотел создать метод Сумма в отдельном классе?
 */
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle=new Circle();
        //    System.out.println(Input.input());
        System.out.println(input.sum());
        circle.resSquareCircle();
        circle.resLength();


    }
}
