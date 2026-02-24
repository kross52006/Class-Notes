import java.util.Scanner;

public class VolumeSquarePyramid
{
 public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter the side lemgth of the base of the square pyramid.");
      double length = meow.nextDouble();
      System.out.println("Enter the height of the square pyramid.");
      double height = meow.nextDouble();
      
      double volume = calcVolume(length, height);
      
      System.out.printf("The volume of a square pyramid with base length of %,.2f units%n" +
         "and height %,.2f units is %,.2f cubic units.", length, height, volume);
      
   }
   
   public static double calcVolume(double length, double height)
   {
      double volume = (1.0 / 3.0) * Math.pow(length, 2.0) * height;
      return volume;
   }
}
