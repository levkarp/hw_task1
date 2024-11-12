
public class Circle {
   // Input input=new Input();
    InputNumberOfRadius inputNumberOfRadius=new InputNumberOfRadius();
   //public static final double PI =3.14;

   public void resSquareCircle(){
double resSquare= Math.PI *Math.pow(inputNumberOfRadius.inputRad(),2);

      System.out.println("площадь круга" + " "+ resSquare);

   }
   public void resLength(){
      double resLenght= 2* Math.PI *inputNumberOfRadius.inputRad();
      System.out.println("длина окружности" + " "+ resLenght);

   }


}
