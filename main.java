import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter your name: ");
      String name = userInput.nextLine();
      System.out.println("Hello " + name);
      System.out.println("Do you wish to continue to the interactive portion of this program? Please Enter: Yes or No");
      String nextPortion = userInput.next();
      if (nextPortion.equalsIgnoreCase("Yes") || nextPortion.equalsIgnoreCase("Y")) {
        System.out.println("Do you have a red car? (yes/no)");
        String car=userInput.nextLine();
        System.out.println("What is the name of your favorite pet?");
        String pet=userInput.nextLine();
        System.out.println("What is the age of your favorite pet?");
        int petAge=Integer.parseInt(userInput.nextLine());
        System.out.println("What is your lucky number?");
        int luckyNumber=Integer.parseInt(userInput.nextLine());
        System.out.println("What is your favorite QB's Jersey number?");
        int favQb=Integer.parseInt(userInput.nextLine());
        System.out.println("What is your two digit model year of your car?");
        int carYear=Integer.parseInt(userInput.nextLine());
        System.out.println("What is the first name of your favorite actor/actress?");
        String actor=userInput.nextLine();
        System.out.println("Enter a random number between 1 and 50.");
        int randomNumber=Integer.parseInt(userInput.nextLine());
        }else{
          System.out.println("Please return later to complete the survey.");
        }

    }
}