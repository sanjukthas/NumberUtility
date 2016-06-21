/*Hi, GOod morning!
Sanjuktha Here...*/
import java.util.Random;
import java.util.Scanner;
   public class Comments {

	public static void main(String[] args) {
		
            Scanner scan = new Scanner(System.in);
        
        /*Enter a random number from 1 to 100 */
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = (int) (random.nextInt((int) (to - from + 1)) + from);
        //
        int guessedNumber = 0;
 
        /* The number is*/ 
        System.out.printf("The number is between %d and %d.\n", from, to);
        
        //
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
} 
