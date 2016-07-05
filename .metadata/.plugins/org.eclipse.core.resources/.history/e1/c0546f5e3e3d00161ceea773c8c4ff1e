package counter;

import java.util.Scanner;

public class ThreadInterrupt {

	public static void main(String[] args) {
		
		System.out.println("Press enter key to stop the timer");
		Thread counter =new Thread (new counter());
		counter.start();
		Scanner keyboard =new Scanner(System.in);
		String s="start";
		while(!s.equals("")){
			s = keyboard.nextLine();
		}
		counter.interrupt();
		keyboard.close();

	}

}
