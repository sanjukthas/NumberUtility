import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);
		
		 for (num=0; num<100;num++)
		 {
		 if (num% 3 == 0 && num % 5 == 0) {
			 System.out.println(" FizzBuzz" + num);
		 }
		 else if (num%3==0){
			 System.out.println(" Fizz" + num);
		 }
		 else if (num%5==0){
			 System.out.println(" Buzz" + num);
		 }
		 else{
			 System.out.println(" " + num);
		 }
		 }
		 
	}
	}


