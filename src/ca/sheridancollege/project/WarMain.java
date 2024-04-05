package ca.sheridancollege.project;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class that contains the main method to run the War game.
 */
public class WarMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt players to register
        String player1Name = getPlayerName(input, "Player 1");
        String player2Name = getPlayerName(input, "Player 2");

        // Prompt for round limit
        int roundLimit = getRoundLimit(input);

        WarGame warGame = new WarGame(player1Name, player2Name, roundLimit);
        warGame.play();
        warGame.declareWinner();

        input.close();
    }

    private static String getPlayerName(Scanner input, String playerNumber) {
        System.out.print("Enter name for " + playerNumber + ": ");
        return input.nextLine();
    }

    private static int getRoundLimit(Scanner input) {
        int roundLimit;
        while (true) {
            try {
                System.out.print("Enter round limit: ");
                roundLimit = input.nextInt();
                if (roundLimit <= 0) {
                    throw new IllegalArgumentException("Round limit must be greater than 0.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // Consume the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return roundLimit;
    }
}
