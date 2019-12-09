// if you run this from an IDE, you'll use a package like the line below
// package webinar.examples;
// if you're running this from the CLI, leave the line above commented


// import required dependencies
import java.util.Random;
import java.util.Scanner;

/*
    Create Java class Guess. This class will play a small and simple
    "Guess My Number Game". It is meant as a very simple introduction
    to working with Java. 
*/
public class Guess {

    // Declare the main() method - (this is where the application starts)
    public static void main(String[] args) {

        // Initialize an object from the Random class
        Random random = new Random();
        // Initialize a randon in - this will be the number the player 
        // is trying to guess
        int num = random.nextInt(10);

        // Initialize a simple boolean to track whether or not 
        // to continue playing
        boolean continuePlaying = true;

        // Communicate with the user 
        System.out.println("Welcome to GUESS MY NUMBER!!");
        System.out.println("Ok, I've got a number in mind...");
        
        // While we should continue playing, loop
        while(continuePlaying) {

            // Prompt the user for their guess
            System.out.println("Please enter a number between 1 & 10: ");
            // Initialize an object of the Scanner class
            Scanner scanner = new Scanner(System.in);
            // Use the scanner to read in the user's guess
            int guess = scanner.nextInt();

            // If the user guessed correctly
            if (guess == num){
                System.out.println("You win! " + guess + " was the right number!");
                
                // STOP THE GAME - looping will cease
                continuePlaying = false;
            } 
            // If the user's guess is too high
            else if (guess > num){
                System.out.println("Nope, sorry, " + guess + " is too high!");
            } 
            // If the user's guess is too low
            else if (guess < num){
                System.out.println("Nope, sorry, " + guess + " is too low");
            }
        }
    }
}

