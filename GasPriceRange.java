import java.util.Scanner;

public class GasPriceRange
{ 
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter the price per barrel of gasoline.");
      int pricePerBarrel = meow.nextInt();
      //call for the other method with name and the informayion that needs to be transfered
      displayRange(pricePerBarrel);
   }
   
   //pricePerBarrel, doesnt have to match, but it can. Easier to remember
   public static void displayRange(int ppb)
   {
      double low = 3.5 * ppb / 100.0;
      double high = 4.0 * ppb / 100.0;
      System.out.printf(" The price of a gallon of gasoline at the pump should be between $%,.2f and $%,.2f.",
         low, high);
   }
}