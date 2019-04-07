package calculator;
/**
 * 
 * Driver program which tests the other programs.
 *
 */
public class Calculator {
	
	public static void main(String args[]){
		
		additionTestCases();
		subtractionTestCases();
		multiplicationTestCases();
		divisionTestCases();
	}
		
	
	static void additionTestCases(){
		//Test case 1:
		Addition addition=new Addition(2,2);
		if(addition.add()==4)
			System.out.println("Addition of  "+2+" and "+2+" is "+4);
		else
			System.out.println("Wrong output for "+2+" and "+2);
		
		//Test case 2
		addition=new Addition(-10,-7);
		if(addition.add()==-17)
			System.out.println("Addition of  "+(-10)+" and "+(-7)+" is "+(-17));
		else
			System.out.println("Wrong output for "+(-10)+" and "+(-7));
		
		
	}

	static void subtractionTestCases(){
		//Test case 1:
		Subtraction subtraction=new Subtraction(1,1);
		if(subtraction.sub()==0)
			System.out.println("Subtraction of  "+1+" and "+1+" is "+0);
		else
			System.out.println("Wrong output for "+1+" and "+1);
		
		//Test case 2
		subtraction=new Subtraction(-10,-7);
		if(subtraction.sub()==2)
			System.out.println("Subtraction of  "+(-10)+" and "+(-7)+" is "+-3);
		else
			System.out.println("Wrong output for "+(-10)+" and "+(-7));
		
		
	}
	
	static void multiplicationTestCases(){
		//Test case 1:
		Multiplication multiplication=new Multiplication(10,10);
		if(multiplication.multiply()==100)
			System.out.println("Multiplication of  "+10+" and "+10+"is "+100);
		else
			System.out.println("wrong output for "+10+" and "+10);
		
		//Test case 2
		multiplication=new Multiplication(15,0);
		if(multiplication.multiply()==0)
			System.out.println("Multiplication of  "+15+" and "+0+" is "+0);
		else
			System.out.println("Wrong output for "+15+" and "+0);
		
	}
	
	static void divisionTestCases(){
		//Test case 1
		Division division=new Division(5,0);
		try{
			division.divide();
			System.out.println("Wrong output for "+5+" and "+0);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by Zero Exception");
		}
		
		//Test case 2
		
		division=new Division(100,5);
		if(division.divide()==20)
			System.out.println("Division of  "+100+" and "+5+" is "+2);
		else
			System.out.println("Wrong output for "+100+" and "+5);
	}
}
