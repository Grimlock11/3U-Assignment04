
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the input for the user
        Scanner input = new Scanner(System.in);
        // tell the user to input the speed limit
        System.out.println("Enter the speedlimit: ");
        // getting a variable for the users input
        int speedlimit;
        // gets the number the user inputed and stores it until needed
        speedlimit = input.nextInt();
        // tell the user to input the speed of the car
        System.out.println("Enter the recorded speed of the car: ");
        // gets the number the user inputed and stores it until needed
        int speed = input.nextInt();
        // getting a variable for users input to subtract the speedlimit from the speed
        int fine = speed - speedlimit;
        // create if statement for if speed is equal to or less then speed limit
        if (fine <= speedlimit) {
            // tell the user congradulations if user is equal to or less than the speedlimit
            System.out.println("Congratulations, you are within the speed limit! ");
        }// create if statement for if speed is between 1 and 20 above the speedlimit 
        if (fine >= 1 && fine <= 20) {
            // tell the user to pay $100 if statment is true (above) 
            System.out.println("You are speeding your fine is $100.");
        }// create if statement for if speed is between 21 and 30 above the speedlimit
        if (fine >= 21 && fine <= 30) {
            // tell the user to pay $270 if statment is true (above) 
            System.out.println("You are speeding your fine is $270.");
        }// create if statement for if speed is above or equal to 31
        if (fine >= 31) {
            // tell the user to pay $500 if statment is true (above) 
            System.out.println("You are speeding your fine is $500.");
        }
    }
}
