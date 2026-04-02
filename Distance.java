import java.util.Scanner;

public class Distance
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter a distance");
      int distance = meow.nextInt();
      
      if(distance <= 100)
      {
         System.out.println("Cost equals $5.00.");
      }
      else if(distance > 100 && distance <= 500)
      {
         System.out.println("Cost equals $8.00.");
      }
      else if(distance > 500 && distance < 1000)
      {
         System.out.println("Cost equals $10.00.");
      }
      else
      {
         System.out.println("Cost equals $12.00.");
      }
      
   }
}