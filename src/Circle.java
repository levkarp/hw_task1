
public class Circle {
   // Input input=new Input();
    InputNumberOfRadius inputNumberOfRadius=new InputNumberOfRadius();
   public static final double pi=3.14;

   public void resSquareCircle(){
double resSquare= inputNumberOfRadius.inputRad()*pi*pi;
      System.out.println("площадь круга" + " "+ resSquare);

   }
   public void resLength(){
      double resLenght= 2*pi*inputNumberOfRadius.inputRad();
      System.out.println("длина окружности" + " "+ resLenght);

   }


}
