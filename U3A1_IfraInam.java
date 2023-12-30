/*
 * Ifra Inam
 * ICS4UE
 * 2023-08-14
 * Mr.Diakoloukas 
 * Purpose of Program: When the user inputs a number, the corresponding modified fibonacci number will be outputted
 */
package u3a1_ifrainam;

import java.util.Scanner; // necessary import for user input

public class U3A1_IfraInam {
    
    private static long[] modifiedfibonacciList; // stores the results of the calculations to find the modified fibonacci number for later use
    
    public static void main(String[] args) {     
        
        int n; // declaration of a variable called n which will be assigned to an inetger inputted by the user
        
        try {
            Scanner scanner = new Scanner(System.in); // creates a Scanner object
            System.out.print("Enter the term number which you would like to know: "); // asks the user to input a number
            n = scanner.nextInt(); // reads user input
            // checks if the integer inputted is not positive and outputs a message to notify the user
            if (n < 0) {
                System.out.println("That is not a positive integer.");
                return; 
            }
        } 
        // checks if the input is not an integer and outputs a message to notify the user
        catch (Exception e) { 
            System.out.println("That is not an integer.");
            return;
        }
        
        modifiedfibonacciList = new long[n + 1]; // initializes the modifiedfibonacciList array where the length is n + 1 (because the sequence starts at n = 0)
        
        System.out.println("Term #" + n + " is " + modifiedfibonacci(n)); // outputs the modified fibonacci number corresponding to the user's input
        
    }

    // method used to find the modified fibonacci number
    private static long modifiedfibonacci(int n) {
        
        switch (n) {
            // base case #1: when n is 0, the modified fibonacci number is 3
            case 0 -> {
                return 3;
            }
            // base case #2: when n is 1, the modified fibonacci number is 5
            case 1 -> {
                return 5;
            }
            // base case #3: when n is 2, the modified fibonacci number is 8
            case 2 -> {
                return 8;
            }
            default -> {}
        }
        
        // checks if the modifiedFibonacciList has a needed, already-calculated, value stored in it
        if (modifiedfibonacciList[n] != 0) {
            return modifiedfibonacciList[n]; // prevents unnecessary calculations by using calculations that have already been found
        }
        
        long nthModifiedFibonacciNumber = (modifiedfibonacci(n - 1) + modifiedfibonacci(n - 2) + modifiedfibonacci(n - 3)); // calculates and stores n's corresponding modified fibonacci number
        modifiedfibonacciList[n] = nthModifiedFibonacciNumber; // stores the result of the calculations from nthModifiedFibonacciNumber in the modifiedfibonacciList array at n
        return nthModifiedFibonacciNumber; // returns n's corresponding modified fibonacci number 
    }
    
}
