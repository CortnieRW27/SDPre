import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name?");
    String fname = keyboard.nextLine();

    System.out.println("What is your last name?");
    String lname = keyboard.nextLine();

    System.out.println("What is you favorite animal?");
    String favoriteAnimal = keyboard.nextLine();

    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();

    System.out.println("What is your favortie song?");
    String favoriteSong = keyboard.nextLine();

    System.out.println("My name is " + fname +" " + lname + ".");
    System.out.println("My favorite animal: " + favoriteAnimal + ".");
    System.out.println("My favorite food: " + favoriteFood + ".");
    System.out.println("My favorite song: " + favoriteSong + ".");

  }
}