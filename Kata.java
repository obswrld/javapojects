import java.util.Scanner;
public class Kata{





	// functions for even numbers
	public static boolean evenNumbers(int number){
		return number % 2 == 0;
	} // even numbers




		
	// functions for prime numbers
	public static boolean isPrimeNumber(int number){
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i * i <= number; i++) {
			if(number % i == 0) {
				return false;
			}
		}	
			return true;	
	}	





	// functions for substraction
	public static int sub(int firstNumber, int secondNumber ) {
		return Math.abs(firstNumber - secondNumber);
	}




	// functions for factors 	
	public static int factors(int number) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int counter = 0;
		System.out.println("Factor of  " + num + " are: ");

		
		for (int i =1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i + " " );
			counter++;
			}
		}
		System.out.println("The number of factor of " + num + " are  " + counter);

		return num;
	}




	// functions for division
	public static float divide(int num1, int num2) {
		if (num2 == 0) {
			return Float.NaN;
		}

			return (float) num1 / num2;
	}




	// functions for square
	public static int square(int number) {
		return number * number;
	}




	// functions for palindrome 
	public static int palindrome(int number) {
		
		int remainder;
		int reverseNumber = 0;
		int temp = number;

		while (temp > 0) {
			remainder = temp % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			temp = temp / 10;
		}

		if (number == reverseNumber) {
			System.out.println("Number is a Palindrome");
		} else {
			if (number != reverseNumber) {
				System.out.println("Number is not a Palindrome");
			}
		}
				return number;
	}




	// functions for factorial
	public static int factorial(int number) {

		if (number < 0 ) {
		System.out.println("Number is invalid.");
	} else {
		int factorial = 1;
		int counter = 0;

		while (counter < number) {
			counter = counter + 1;
			factorial = factorial * counter;
		}
		System.out.println("Factorial of "+ number + " is: " + factorial);
	}
			return number;
	}




	public static boolean squareOf(int number) {
		if (number < 0) {

			System.out.print(number + "false");
			return false;
		}
		if (number == 0 || number == 1) {
			System.out.print(number + "True");
			return true;
		}

		long root = (long) Math.sqrt(number);
		return root * root == number;

		

	}
}