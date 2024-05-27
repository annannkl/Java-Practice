import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[]args) {
        ColoredUI coloredUI = new ColoredUI();
        Scanner sc = new Scanner(System.in);
        Random R = new Random();
        int num;
        String userChoice;
        String computerChoice = "";

        System.out.println(coloredUI.getMagenta() + "-------------------------------------------------" );
        System.out.println("Hello There Visitor!");
        System.out.println("Welcome to ROCK PAPER SCISSOR SHOOT!");
        System.out.println("-------------------------------------------------" + coloredUI.getRESET());
        System.out.println(coloredUI.getBlue() + "-------------------------------------------------");
        System.out.println("                /   MENU    /");
        System.out.println("-------------------------------------------------" + coloredUI.getRESET());
        System.out.println(coloredUI.getBlue()  + "1. R)ock");
        System.out.println("2. P)aper");
        System.out.println("3. S)cissors");
        System.out.println("-------------------------------------------------" + coloredUI.getRESET());

        System.out.println(coloredUI.getCyan() + "-------------------------------------------------");
        System.out.print("Please choose one of these options ->:" + coloredUI.getRESET());

        userChoice = sc.nextLine().toUpperCase();

        //Computer's Choice
        num = R.nextInt(3);

        if(num == 0) {
            computerChoice = "R";
        }

        else if(num == 1) {
            computerChoice = "P";
        }

        else if(num == 2) {
            computerChoice = "S";
        }

            //Print the computer's choice

            if(computerChoice.equals("S")) {
                System.out.println(coloredUI.getCyan() + "-------------------------------------------------" + coloredUI.getRESET());
                System.out.println(coloredUI.getRed() + "-------------------------------------------------");
                System.out.println(coloredUI.getRed() + "The Computer Chose Scissors." + coloredUI.getRESET());
                System.out.println(coloredUI.getRed() + "-------------------------------------------------");
            }
            else if(computerChoice.equals("R")) {
                System.out.println(coloredUI.getRed() + "-------------------------------------------------");
                System.out.println(coloredUI.getRed() + "The Computer Chose Rock." + coloredUI.getRESET());
                System.out.println(coloredUI.getRed() + "-------------------------------------------------");
            }
            else if(computerChoice.equals("P")) {
                System.out.println(coloredUI.getRed() + "-------------------------------------------------");
                System.out.println(coloredUI.getRed() + "The Computer Chose Paper." + coloredUI.getRESET());
                System.out.println(coloredUI.getRed() + "-------------------------------------------------");
            }

            // Determine a winner

            if(userChoice.equals("R") && computerChoice.equals("S")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() + "The User Wins!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("P") && computerChoice.equals("R")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() + "The User Wins!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("S") && computerChoice.equals("P")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() + "The User Wins!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("S") && computerChoice.equals("R")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() + "The Computer Wins!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("R") && computerChoice.equals("P")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen()+ "The Computer Wins!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("P") && computerChoice.equals("S")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() + "The Computer Wins!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("S") && computerChoice.equals("S")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() + "Tie Game!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("R") && computerChoice.equals("R")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() +  "Tie Game!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
            else if(userChoice.equals("P") && computerChoice.equals("P")) {
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
                System.out.println(coloredUI.getGreen() +  "Tie Game!" + coloredUI.getRESET());
                System.out.println(coloredUI.getGreen() + "-------------------------------------------------");
            }
        System.out.println(coloredUI.getMagenta() + "-------------------------------------------------");
        System.out.println("Thank you for playing this lovely game!");
        System.out.println("Until next time. Bye!");
        System.out.println(coloredUI.getMagenta() + "-------------------------------------------------" + coloredUI.getRESET());
    }
}
