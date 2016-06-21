
package NumberUility;

import NumberUility.NumberUtility;

public class Numbertest {

	public static void main(String[] args) {
		System.out.println(NumberUtility.formatAsPercentage(35.6));
		System.out.println(NumberUtility.formatInCcurrency(35.6));
		System.out.println(NumberUtility.formatwithDecimalPlaces(55.120536, 5));
		System.out.println(NumberUtility.random(6, 60));
		System.out.println(NumberUtility.max(60.059, 60));
		System.out.println(NumberUtility.min(60.059, 60));

	}

}