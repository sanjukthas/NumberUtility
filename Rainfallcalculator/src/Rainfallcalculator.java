import java.util.Scanner;

public class Rainfallcalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 double length, wide, height;
		 
		 System.out.print( "Enter the length of the roof in inches: " );
		    length = keyboard.nextInt();
		 System.out.print( "Enter the wide of the roof in inches:" );
		    wide = keyboard.nextInt();
		 System.out.print( "Enter the height of the roof in inches: " );
		    height = keyboard.nextInt();
		 System.out.println("The total inches of water is : " + (length*wide*height));
		 System.out.println("The total gallon of water is : " + ((length*wide*height)/231));
	}

}
