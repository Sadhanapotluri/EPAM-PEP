package calculator;
/**
 * 
 * This program finds the division of numbers.
 * number1 and number2 are inputs.
 * 
 */

public class Division {
	int dividend,divisor;
	Division(){} //Default constructor
	
	Division(int dividend, int divisor){
		this.dividend=dividend;
		this.divisor=divisor;
	}
	
	int divide() throws ArithmeticException {
		return dividend/divisor; //Raises exception if divisor is 0.
	}
}
