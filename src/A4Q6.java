
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // get the number of minutes the user uses in the daytime
        System.out.println("Number of daytime minutes? ");
        // saves the number that was inputed
        double myint1;
        // gets the number from the user
        myint1 = input.nextDouble();
        // get the number of minutes the user uses in the evening
        System.out.println("Number of evening minutes? ");
        // saves the number that was inputed
        double myint2;
        // gets the number from the user
        myint2 = input.nextDouble();
        // get the number of minutes the user uses on the weekend
        System.out.println("Number of weekend minutes? ");
        // saves the number that was inputed
        double myint3;
        // gets the number from the user
        myint3 = input.nextDouble();
        // calculate total cost for plan A
        double planA = myint1 * 0.25 - 100 + myint2 * 0.15 + myint3 * 0.20;
        // tell the user how much plan A will cost
        System.out.println("Plan A costs $" + planA);
        // calculate total cost for Plan B
        double planB = myint1 * 0.45 - 250 + myint2 * 0.35 + myint3 * 0.20;
        // tell the user how much plan B will cost
        System.out.println("Plan B costs $" + planB);
        // determine which plan is cheaper
        if (planA > planB) {
            System.out.println("Plan B is cheaper");
        }
        if (planA == planB) {     
            System.out.println("Plan A and B are equal");
        }
        if (planA < planB){    
            System.out.println("Plan A is cheaper");
        }
    }
}
