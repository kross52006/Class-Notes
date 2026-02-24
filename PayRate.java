import java.util.Scanner;

public class PayRate
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter hourly pay rate.");
      double payRate = meow.nextDouble();
      System.out.println("Enter regular hours.");
      double hours = meow.nextDouble();
      System.out.println("Enter overtime hours.");
      double overtime = meow.nextDouble();
      
      double pay = weeklyPay(payRate, hours, overtime);
      
      System.out.printf("At an hourly pay rate of $%,.2f, %,.2f regular hours and %,.2f overtime hours %nyields " +
         "a total pay of $%,.2f.", payRate, hours, overtime, pay);
   }
   
   public static double weeklyPay(double payRate, double hours, double overtime)
   {
      double pay = hours * payRate + overtime * (1.5 * payRate);
      return pay;
   } 
}