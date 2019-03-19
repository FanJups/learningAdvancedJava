package factorialcalculator;

import java.math.BigInteger;

public class FactorialCalculator {

	public static BigInteger factorial(BigInteger number) {
		if (number.compareTo(BigInteger.ONE) <= 0)
			return BigInteger.ONE;
		else
			return number.multiply(factorial(number.subtract(BigInteger.ONE)));
	}

	// output factorials for values 0-21

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calculate the factorials of 0 trough 21
		for (int counter = 0; counter <= 50; counter++)
			System.out.println(counter + "! = " + factorial(BigInteger.valueOf(counter)));

	}

}
