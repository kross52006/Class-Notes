import java.util.Scanner;

public class TemperatureConverter
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.printf("Enter a temperature in Celsius.%n");
      double celcius = meow.nextDouble();
      double fahrenheit = convCtoF(celcius);
      System.out.printf("The Temperature %,.1f Celsius is %,.1f Fahrenheit.", celcius, fahrenheit);
  
   }
   
   public static double convCtoF(double celcius)
   {
      double fahrenheit = 9 / 5 * celcius + 32;
      return fahrenheit;
   }
}