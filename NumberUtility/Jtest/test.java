import static org.junit.Assert.*;

import org.junit.Test;

import NumberUility.NumberUtility;

public class test {

	@Test
	public void test() {
		String out= NumberUtility.formatAsPercentage(5.8);
		System.out.println(out);
		String out1= NumberUtility.formatInCcurrency(5.8);
		System.out.println(out1);
		String out2= NumberUtility.formatwithDecimalPlaces(5.8, 0);
		System.out.println(out2);
		int out3= NumberUtility.random( 5,6);
		System.out.println(out3);
		 
	}

}
