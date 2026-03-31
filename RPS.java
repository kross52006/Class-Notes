import java.util.Scanner;
import java.util.Random;

public class RPS
{
   public static void main(String[] args)
   {
      Scanner meow = new Scanner(System.in);
      System.out.println("Enter rock, paper, or scissors");
      String userChoice = meow.nextLine();
      
      if(!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")))
      {
         System.out.println("Invalid input! Terminating program.");
         return;
      }
      
      Random random = new Random();
      int computerChoiceInt = random.nextInt(3); //up to but not including 3
     
      String computerChoice = "";
      if(computerChoiceInt == 0)
      {
         computerChoice = "rock";
      }
      else if(computerChoiceInt == 1)
      {
         computerChoice = "paper";
      }
      else //(computerChoiceInt == 2)
      {
         computerChoice = "scissors";
      }
      
      if(userChoice.equals(computerChoice))
      {
         System.out.printf("You chose %s. The computer chose %s. It's a tie!", userChoice, computerChoice);
      }
      else if(userChoice.equals("rock") && computerChoice.equals("paper"))
      {
         System.out.printf("You chose %s. The computer chose %s. Paper covers rock. The computer wins!", userChoice, computerChoice);
      }
      else if(userChoice.equals("scissors") && computerChoice.equals("paper"))
      {
         System.out.printf("You chose %s. The computer chose %s. Scissors cuts paper. You win!", userChoice, computerChoice);
      }
      else if(userChoice.equals("rock") && computerChoice.equals("scissors"))
      {
         System.out.printf("You chose %s. The computer chose %s. Rock smashes scissors. You win!", userChoice, computerChoice);
      }
      else if(userChoice.equals("paper") && computerChoice.equals("rock"))
      {
         System.out.printf("You chose %s. The computer chose %s. Paper covers rock. You win!", userChoice, computerChoice);
      }
      else if(userChoice.equals("paper") && computerChoice.equals("scissors"))
      {
         System.out.printf("You chose %s. The computer chose %s. Scissors cuts paper. The computer wins!", userChoice, computerChoice);
      }
      else if(userChoice.equals("scissors") && computerChoice.equals("rock"))
      {
         System.out.printf("You chose %s. The computer chose %s. Rock smashes scissors. The computer wins!", userChoice, computerChoice);
      }

   }
}