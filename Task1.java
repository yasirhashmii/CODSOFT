import java.util.Random;
import java.util.Scanner;

public class numberGame {
  public static int getRandomInRange(int start, int end) {
    Random generator = new Random();
    return start + generator.nextInt(end - start + 1);
  }

  public static void main(String[] args) {
    int score = 0;
    int attempts = 0;
    boolean playAgain = true;

    while (playAgain) {
      int life = 3;
      Scanner scanner = new Scanner(System.in);

      while (life != 0) {
        System.out.print("Enter a number between 1 & 100: ");
        int n = scanner.nextInt();
        int random = getRandomInRange(1, 100);
        System.out.println("Random number between 1 & 100: " + random);
        attempts++;

        if (n == random) {
          System.out.println("You won, get an extra life");
          life++;
          System.out.println("Life remaining: " + life);
          score++;
        } else {
          System.out.println("You guessed the wrong number");
          life--;
          System.out.println("Life remaining: " + life);
          System.out.println("");
        }
      }

      System.out.println("");
      System.out.println("Out of lives, exiting code.");

      System.out.print("Do you want to play again? (y/n): ");
      String response = scanner.next();

      if (response.equalsIgnoreCase("y")) {
        playAgain = true;
        System.out.println("Let's play again!");
      } else {
        playAgain = false;
        System.out.println("Thanks for playing! Your final score is " + score + " out of " + attempts + " attempts.");
      }
    }
  }
}
