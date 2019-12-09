
// Import required depenencies
import java.util.Random;

/*
    Class Prime will be used to determine the 
    Prime numbers between 1 and 100 (or 500).
*/
public class Prime {

    // Declare the main() method - the entry point of the application
    public static void main(String[] args) {
        // Call the printPrimes() method - that method will do all the world
        printPrimes(100);
    }

    // Declare the printPrimes method. This method takes in a parameter "high".
    // High will determine until which number to find all prime numbers
    private static void printPrimes(int high) {

        // using a for loop to iterate from 1 to the argument "high"
        // we will check every number from 1 to "high" to see if it's prime
        for (int i = 1; i < high; i++){
            // Initiailize a boolean to keep prime state 
            // (this could/should be declared outside this loop)
            // and reset to "true" on every iteration
            boolean isPrime = true;   

            // iterate from 2 up to "i" (the number we're checking if prime)      
            for (int x = 2; x < i; x++){
                // if "i" modulo "x" = 0 - then "i" is NOT prime
                // a prime number should only be divisible by 1 and itself
                if (i % x == 0){
                    // set isPrime to false
                    isPrime = false;
                    // break out of the loop
                    break;
                }
            }
            // now that we've completed the loop, check if isPrime is 
            // still set to "true"
            if(isPrime == true){
                // if isPrime is still "true" print that prime number
                System.out.println(i);
            }
        }
    }
}

