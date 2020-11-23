/* Completed assignment "RockPaperScissors++" by Tyler Delane on 2020-11-22 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // Create the scanner object we'll need to get user input
    public static int wins, losses = 0;
    public static Scanner scanner = new Scanner(System.in);
    // Add variables to track the cumulative user score

    public static void main(String[] args) {
        System.out.println("Choose rock paper or scissors  'r' for rock, 'p' for paper, and 's' for scissors.  To exit choose 'x'" );
        do {
            String user = userChoice();         // Create a string containing validated user input for their choice
            String comp = computerChoice();     // Create a string with a generated random choice for the computer
            determineWinner(comp, user);        // Evaluate whether the computer or user won, and record/display stats
        } while (true);
    }

    // When called, generate a random number from 1 to 3
    // Map 1 to 3 to string values of choices and return the result
    public static String computerChoice() {
        String computer = "";
        Random rand = new Random();
        int cinput = rand.nextInt(3) + 1;

        switch (cinput) {
            case 1 -> computer = "rock";
            case 2 -> computer = "paper";
            case 3 -> computer = "scissors";
        }

        return computer;
    }

    public static String userChoice() {

        String user, retVal = "";           // initialize variables
        // print out the win/loss counts so far
        System.out.println("***************************************************");
        System.out.printf("Wins: %d\tLosses: %d\n", wins, losses);
        System.out.println("Players Choice:");
        // prompt the user for their input
        user = scanner.nextLine();
        // if the input passes validation, map their choice to a string and return it
        if (isValidChoice(user)) {
            switch (user) {
                case "r" -> retVal = "rock";
                case "p" -> retVal = "paper";
                case "s" -> retVal = "scissors";
            }
        }

        return retVal;
    }


    public static boolean isValidChoice(String choice) {
        switch (choice) {
            // check whether the supplied string is one of the three we want
            case "r", "p", "s" -> {
                return true;
            }
            // if they chose 'x' to exit, then exit gracefully
            case "x" -> {
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
            // otherwise, tell them they made an invalid choice
            default -> {
                System.out.println("Invalid choice!  Please try again.");
            }
        }

        return true;
    }

    // Print out the choices, determine winner, and record/display the results
    public static void determineWinner(String computer, String user) {
        if (computer.equals("rock") && user.equals("scissors")) {
            System.out.println("You lose!");
            losses++;
        }

        if (computer.equals("scissors") && user.equals("paper")) {
            System.out.println("You lose!");
            losses++;
        }

        if (computer.equals("paper") && user.equals("rock")) {
            System.out.println("You lose!");
            losses++;
        }

        if (computer.equals("rock") && user.equals("paper")) {
            System.out.println("You win!");
            wins++;
        }

        if (computer.equals("scissors") && user.equals("rock")) {
            System.out.println("You win!");
            wins++;
        }

        if (computer.equals("paper") && user.equals("scissors")) {
            System.out.println("You win!");
            wins++;
        } else if (computer.equals(user)) {
            System.out.println("Draw!");
        }

        System.out.print("Computer choice: " + computer);
        System.out.println("\tPlayer choice: " + user);
    }
}