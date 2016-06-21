import java.util.Random;
public class Randomdebug {

	public static void main(String[] args) {
		
		
		 output("Generate 10 random integers between 0 and 6");
		        Random rnd = new Random();
		        
		        for (int i = 1; i <= 12; ++i)
		        {
		          int randomInt = 1 + rnd.nextInt(6-1);
		          output("Generated number: " + randomInt);
		        }
		    
		        output("Done.");
		    }
		  
		  private static void output(String aMessage)
		  {
		    System.out.println(aMessage);
		  }
		
	}


