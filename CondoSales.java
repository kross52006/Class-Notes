import java.util.Scanner;

public class CondoSales
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      
      System.out.println("Summerdale Condos");
      System.out.println("1. Parkview $150,000");
      System.out.println("2. Golf Course View $170,000");
      System.out.println("3. Lake View $210,000");
      System.out.println("Enter the number of the chosen option.");
      
      String choice = meow.nextLine();
      
      int price = 0;
      String view = "";
      
      if(choice.equals("1"))
      {
         price = 150000;
         view = "Park";
      }
      else if(choice.equals("2"))
      {
         price = 170000;
         view = "Golf Course";
      }
      else if(choice.equals("3"))
      {
         price = 210000;
         view = "Lake";
      }
      else 
      {
         price = 0;
         view = "an invalid";
         System.out.println("You chose an invalid view.");
      }
      
      if(price != 0)
      {
         String parkingOption = "";
         System.out.println("Enter 1 for garage and enter 2 for parking space.");
         String parking = meow.nextLine();
         
         if(parking.equals("1"))
         {
            price = price + 5000;
            parkingOption = "garage";
         }
         else if(parking.equals("2"))
         {
            parkingOption = "parking space";
         }
         else
         {
            System.out.println("Invalid parking option, Defaulting to parking space.");
            parkingOption = "parking space";
         }
         
          System.out.printf("You chose %s View with a %s. The price is $%,d.", view, parkingOption, price);         
      }
            
   }
}