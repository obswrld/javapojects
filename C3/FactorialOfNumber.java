public class FactorialOfNumber {
	public static void main(String[] args) {
		int number = 10;
		int counter = 1;
		int factorial = 1;

		while (counter <=  number) {
			factorial = factorial * counter;
			counter = counter + 1;
		}	
		System.out.println("The factorial of 10 is: "+  factorial);






	
	}


}