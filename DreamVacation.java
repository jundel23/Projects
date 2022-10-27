import java.util.Scanner;

public class DreamVacation{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Where do you dream of going? ");
    String place = input.nextLine();

    System.out.println("What would you like to do there? ");
    String plan = input.nextLine();

    System.out.println("Welcome to New Jersey!");
    System.out.println("I hope you enjoy it here, even though it is not " + place + ".");
    System.out.println("Here, you can do nothing instead of " + plan + " in " + place + ".");
  }
}