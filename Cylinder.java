import java.util.Scanner;

public class Cylinder
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter a radius.");
      double radius = meow.nextDouble();
      System.out.println("Enter a length.");
      double length = meow.nextDouble();
      
      double area = compArea(radius);
      double volume = compVolume(area, length);
      
      System.out.printf("The area of the base is %,.2f square units.%n" +
      "The Volume is %,.1f cubic units.", area, volume);
   }
   
   public static double compArea(double radius)
   {
      double areaBase = Math.PI * Math.pow(radius,2.0);
      return areaBase;
   }
   
    public static double compVolume(double areaBase, double length)
   {
      //double area = Math.PI * Math.pow(radius,2.0);
      double volume = areaBase * length;
      return volume;
   }
}