
package NumberUility;

import NumberUility.NumberUtility;

public class Numbertest {

	public static void main(String[] args) {
		System.out.println(NumberUtility.formatAsPercentage(67.2));
		System.out.println(NumberUtility.formatInCcurrency(67.2));
		System.out.println(NumberUtility.formatwithDecimalPlaces(67.25555558, 5));
		System.out.println(NumberUtility.random(5, 50));
		System.out.println(NumberUtility.max(50.058, 50));
		System.out.println(NumberUtility.min(50.058, 50));

	}

}