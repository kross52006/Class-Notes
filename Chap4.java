import java.util.Scanner;

public class Chap4
{
   public static void main(String[] args)
   {
      double radius1 = 31.3;
      double height1 = 5.6;
      double radius2 = 7.8;
      double height2 = 10.9;
      double radius3 = 0.12;
      double height3 = 1.62;
      
      meow(radius1, height1);
      meow(radius2, height2);
      meow(radius3, height3);
   }
   public static void meow(double radius, double height)
   {
      double volume = Math.PI * Math.pow(radius, 2.0) * height;
     // double volume2 = Math.PI * Math.pow(radius2, 2.0) * height2;
     // double volume3 = Math.PI * Math.pow(radius3, 2.0) * height3;
      
      System.out.printf("the area of a right circular cylindar with radius %,.2f units" +
      " and height %,.2f units is %,.2f cubic units. %n", radius, height, volume);
     // System.out.printf("the area of a right circular cylindar with radius %,.2f units" +
     // " and height %,.2f units is %,.2f cubic units. %n", radius2, height2, volume2);
     // System.out.printf("the area of a right circular cylindar with radius %,.2f units" +
     // " and height %,.2f units is %,.2f cubic units.", radius3, height3, volume3);
   
   }
}