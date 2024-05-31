package EvenOddNumber;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        int number, reminder;

        System.out.println("---------------------------------");
        System.out.print("Please enter an Integer Number: ");

        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        reminder = number % 2;
        System.out.println("---------------------------------");

        if ( reminder == 0 ) {
            System.out.println(number +": Even Number!");
        }
        else
            System.out.println(number +": Odd Number!");
    }
}
