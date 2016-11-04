
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyaf3300
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the input for the user
        Scanner input = new Scanner(System.in);
        // get users name 
        System.out.println("Please enter your name: ");
        // saves the users name
        String myint1;
        // get the number from the user
        myint1 = input.next();
        // ask the user for what the test was out of (x5)
        System.out.println("What was the first test out of?: ");
        // // getting a variable for the users input (X5)
        double myint2;
        // get the number from the user and stores it until needed (x5)
        myint2 = input.nextDouble();
        // ask for the mark the user got on the test (x5)
        System.out.println("What mark did you get?: ");
        double myint3;
        myint3 = input.nextDouble();
        // ask for the number the test was out of (x5)
        System.out.println("What was the second test out of?: ");  
        double myint4;   
        myint4 = input.nextDouble();      
        System.out.println("What mark did you get?: ");
        double myint5;
        myint5 = input.nextDouble();
        System.out.println("What was the third test out of?: ");  
        double myint6;   
        myint6 = input.nextDouble();      
        System.out.println("What mark did you get?: ");
        double myint7;
        myint7 = input.nextDouble();
        System.out.println("What was the fourth test out of?: ");  
        double myint8;   
        myint8 = input.nextDouble();      
        System.out.println("What mark did you get?: ");
        double myint9;
        myint9 = input.nextDouble();
        System.out.println("What was the fifth test out of?: ");  
        double myint10;   
        myint10 = input.nextDouble();      
        System.out.println("What mark did you get?: ");
        double myint11;
        myint11 = input.nextDouble();
        // tell user were to find test scores (under (Test Scores for + name)title)
        System.out.println("Test Scores for " + myint1);
        // get each test and divide the users mark from what the test is out of and times it by 100 (x5)
        double test1 = myint3/myint2*100;
        // display the users test score of each test (x5)
        System.out.println("Test 1: " + test1 + "%");
        double test2 = myint5/myint4*100;
        System.out.println("Test 2: " + test2 + "%");  
        double test3 = myint7/myint6*100;
        System.out.println("Test 3: " + test3 + "%");
        double test4 = myint9/myint8*100;
        System.out.println("Test 4: " + test4 + "%");
        double test5 = myint11/myint10*100;
        System.out.println("Test 5: " + test5 + "%");
        // get all of the avereges of each test and add them up then divide by the number of tests
        System.out.println("Average: " +( test1 + test2 + test3 + test4 + test5)/5 + "%");
        //end program
    }
}
