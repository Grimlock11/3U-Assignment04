
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the input for the user
         //Create scanner 
        Scanner input = new Scanner(System.in);
        // create a variable to store the players position
        int player = 1;
        // create a while loop to start and end the program (game)
        while (player < 100) {
            // ask the user for the sum of the dice
            System.out.println("Enter Sum of Dice");
            // store the value in a dice variable
            int dice = input.nextInt();
            // if the dice is 0 say to the user "You Quit"
            if (dice < 2 || dice > 12) {
                System.out.println("You Quit!");
                break;
            }// get the player to prgress by adding the dice to the player
            player = player + dice;
            // make if statements to tell the user when on a ladder or snake
            if (player == 9) {
                System.out.println("You have landed on a ladder");
                player = player + 25;
            }
            if (player == 40) {
                System.out.println("You have landed on a ladder");
                player = player + 24;
            }
            if (player == 67) {
                System.out.println("You have landed on a ladder");
                player = player + 19;
            }
            if (player == 54) {
                System.out.println("You have landed on a snake");
                player = player - 35;
            }
            if (player == 90) {
                System.out.println("You have landed on a snake");
                player = player - 42;
            }
            if (player == 99) {
                System.out.println("You have landed on a snake");
                player = player - 22;
            }
            if (player == 100) {
                System.out.println("Congradulations, You won!");
                break;
            }// tell the player where they are on the board
            System.out.println("You are now on square " + player);
        }
    }
} 