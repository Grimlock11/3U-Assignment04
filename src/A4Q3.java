
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyaf3300
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create an input for the user
        Scanner input = new Scanner(System.in);
        // tell user to put in four numbers on separate lines
        System.out.println("Please enter in 4 numbers on separate lines: ");
        // get the numbers from the user (x5)
        // saves the number the user put in (x5)
        double myInt1;
        myInt1 = input.nextDouble();
        double myInt2;
        myInt2 = input.nextDouble();
        double myInt3;
        myInt3 = input.nextDouble();
        double myInt4;
        myInt4 = input.nextDouble();
        // gets all the numbers and put it in one line in order
        System.out.println("Your numbers were " + myInt1 + ", " + myInt2 + ", " + myInt3 + ", and " + myInt4);
        // end program
    }
}
