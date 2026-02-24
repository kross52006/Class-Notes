import java.util.Scanner;

public class Average
{
 public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter an integer.");
      int number = meow.nextInt();
      System.out.println("Enter another integer.");
      int numberTwo = meow.nextInt();
      
      double average = calcAverage(number, numberTwo);
      
      System.out.printf("The avergae of %,d and %,d is %,.2f.", number, numberTwo, average);
   }
   
   public static double calcAverage(int number, int numberTwo)
   {
      double average = (number + numberTwo) / 2.0;
      return average;
   }
}