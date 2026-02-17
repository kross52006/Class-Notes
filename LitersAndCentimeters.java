import java.util.Scanner;

public class LitersAndCentimeters
{ 
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("an integer.");
      int number = meow.nextInt();
      cmToIn(number);
   }
   
   public static void cmToIn(int inches)
   {
      double cm = inches * 2.54;
      System.out.printf("There are %,.1f cm in %,d in.%n", cm, inches);
      literToGal(inches);
   }
   
   public static void literToGal(int gallons)
   {   
      double liter = 3.7854 * gallons;
      System.out.printf("There are %,.1f L in %,d gal.", liter, gallons);
   }
}