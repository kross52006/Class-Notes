import java.util.Scanner;

public class MethodPractice
{
   public static void main(String[] args)
   {
      getUserImput();
   }
   
   public static void getUserImput()
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter an integer.");
      int number = meow.nextInt();
      System.out.println("Enter another integer.");
      int numberTwo = meow.nextInt();
      addTwoNumbers(number, numberTwo);
   }
   
   public static void addTwoNumbers(int number, int numberTwo)
   {
      int total = number + numberTwo;
      displayTotal(total);
   }
   
   public static void displayTotal(int total)
   {
      System.out.printf("The total is %,d.", total);
   }
}