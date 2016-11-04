
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyaf3300
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the input for the user
        Scanner input = new Scanner(System.in);
        // get user to input the amount of money each item costs
        System.out.println("How much does the food for prom cost? : ");
        // getting a variable for the users input (x6)
        int myInt1;
        // gets the number from the user and stores it until needed (x6)
        myInt1 = input.nextInt();
        // get user to input the amount of money each of the items/people/places costs
        System.out.println("How much does the DJ cost? : ");
        int myInt2;
        myInt2 = input.nextInt();
        System.out.println("How much does it cost to rent the hall? :  ");
        int myInt3;
        myInt3 = input.nextInt();
        System.out.println("How much does decorations cost? : ");
        int myInt4;
        myInt4 = input.nextInt();
        System.out.println("How much does it cost for staff? : ");
        int myInt5;
        myInt5 = input.nextInt();
        System.out.println("How much for miscellaneous costs? :  ");
        int myInt6;
        myInt6 = input.nextInt();
        // get all the numbers the user inputed and add them all up to give the total
        int totalcost = myInt1+myInt2+myInt3+myInt4+myInt5+myInt6;
        // get the total cost and divide by the ticket cost
        int tickets = totalcost/35;
        // tell the users total cost
        System.out.println("The total cost is " + totalcost);
        // tell the user how many tickets must be sold to break even with the total cost
        System.out.println("you will need to sell " + tickets + " to break even");
        // end program
    }
}
