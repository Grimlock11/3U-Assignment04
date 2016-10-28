
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyaf3300
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the input for the user
        Scanner input = new Scanner (System.in);
        // ask for the number the person whishes to convert
        System.out.println("Please enter the measurement in inches you wish to convert: ");
        // user inputs number and it is saved
        double myInt;
        // save users number
        double myIntDouble;
        // get the number from the user
        myInt = input.nextDouble();
        // output the number the user has origanally put in inches into cm
        System.out.println("Your number in cm is "+ myInt*2.54);
        // end program
    }
}
