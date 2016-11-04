
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
        // getting a variable for users input
        int fine = 0;
        // gets the number the user inputed and stores it until needed
        fine = input.nextInt();
        
        if (fine <= speedlimit) {
            System.out.println("Congratulations, you are within the speed limit! ");

        } else if (fine >= 1 && fine <= 20) {
            System.out.println("You are speeding your fine is $100.");
        } else if (fine >= 21 && fine <= 30) {
            System.out.println("You are speeding your fine is $270.");
        }else if (fine >= 31){
            System.out.println("You are speeding your fine is $500.");
    }
}
}
