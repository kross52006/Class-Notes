import java.util.Scanner;

public class Integer
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter an integer.");
      int number = meow.nextInt();
      
      
      if(number % 2 == 0)
      {
         System.out.printf("The number %,d is even.", number);
      }
      else
      {
          System.out.printf("The number %,d is odd.", number);
      }
   }
}