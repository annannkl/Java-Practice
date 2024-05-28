package NumberGuessing;

import RockPaperScissors.ColoredUI;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        ColoredUI coloredUI = new ColoredUI();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println(coloredUI.getCyan() + "The Random Number is: " + randomNumber);
        //System.out.println("------------------------------------" + coloredUI.getRESET());

        System.out.println(coloredUI.getPurple() + "------------------------------------------");
        System.out.println("Welcome! Let's play a game, shall we? :D" + coloredUI.getRESET());

        int tryCount = 0;
        while(true) {
            System.out.println(coloredUI.getBlue() + "------------------------------------------");
            System.out.print("Enter your guess (1-100): " + coloredUI.getRESET());

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println(coloredUI.getGreen()+ "------------------------------------");
                System.out.println("Correct! You win!" + coloredUI.getRESET());
                System.out.println(coloredUI.getCyan()+ "---------------------");
                System.out.println("It took you " + tryCount + " tries!" + coloredUI.getRESET());
                System.out.println(coloredUI.getPurple() + "------------------------------------------------");
                System.out.println("That's all for now! Thanks for playing! Bye! :D" + coloredUI.getRESET());
                break;
            }
            else if (randomNumber > playerGuess) {
                System.out.println(coloredUI.getRed()+ "------------------------------------");
                System.out.println("False! The number is higher! Guess again!" + coloredUI.getRESET());

            }
            else {
                System.out.println(coloredUI.getRed()+ "------------------------------------");
                System.out.println("False! The number is lower! Guess again!" + coloredUI.getRESET());
            }
        }
    }
}
