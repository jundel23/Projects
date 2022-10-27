import java.util.Scanner;

public class MadLibs{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter an adjective: ");
    String adj = input.nextLine();

    System.out.println("Enter an verb: ");
    String verb = input.nextLine();

    System.out.println("Enter an noun: ");
    String noun = input.nextLine();

    System.out.println("You were walking down the street when you saw a " + adj + " bird. After, the bird flew away and it proceeded to " + verb + ". Shortly after, you decide to go to " + noun + " where you realize that this is all a dream.");
  }
}