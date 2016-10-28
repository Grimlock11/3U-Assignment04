
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user
        Scanner input = new Scanner(System.in);
        // ask for the name of the user
        System.out.println("please enter name");
        // get the name of the user
        String name = input.nextLine();
        // say hello
        System.out.println("Hello " + name);
        // end program
    }
}
