import java.util.Scanner;

public class Tempurature
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter today's high temperature.");
      int high = meow.nextInt();
      
      System.out.println("Enter today's low temperature.");
      int low = meow.nextInt();
      
      if(high >= 90)
      {
         System.out.println("Heat Warning");
      }
      if(low <= 32)
      {
         System.out.println("Freeze Warning");
      }
      if(high - low >= 40)
      {
         System.out.println("Large Temperature swing");
      }
      else
      {
         System.out.println("Normal temperatures");
      }  
      
   }
}