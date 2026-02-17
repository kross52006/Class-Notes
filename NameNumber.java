import java.util.Scanner;

public class NameNumber
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter your name.");
      String name = meow.nextLine();
      System.out.println("Enter a whole number.");
      int number = meow.nextInt();
      displayNameNumber(name, number);
      
   }
   
   public static void displayNameNumber(String name, int number)
   {
      System.out.printf(" Hi %s. You entered the number %,d.", name, number);
   }
}