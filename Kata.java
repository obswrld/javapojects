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

		for (int i = 2; i <= Math.sqrt(number); i++) {
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
		
			return (float) num1 / num2;
	}




	// functions for square
	public static int square(int number) {
		return number * number;
	}




	// functions for int palindrome 
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
		return root == Math.floor(root);

		

	}

	
	public static void primeNumbers(int number) {
		int count = 0;
		int num = 2;

		while(count < 50) {
			int div = 0;
		for (int i = 1;  i <= number; i++) {
			if (num % i == 0) {
				div++;
			}
		}

		if (div == 2) {
			System.out.println(number + " ");
			count++;
		}
		num++;
		}
	}



	public static int CopiesDriller(int copySelection) {
		int pricePerCopy = 0;

		if (copySelection < 1){
			System.out.println("Please Enter Amount of Copy Selected:   ");
		} else {
			if (copySelection >= 1 && copySelection <= 4) {
				pricePerCopy = 2000;
			}
			if (copySelection >= 5 && copySelection <= 9) {
				pricePerCopy = 1800;
			}
			if (copySelection >= 10 && copySelection <= 29) {
				pricePerCopy = 1600;
			}
			if (copySelection >= 30 && copySelection <= 49) {
				pricePerCopy = 1500;
			}
			if (copySelection >= 50 && copySelection <= 99) {
				pricePerCopy = 1300;
			}
			if (copySelection >= 100 && copySelection <= 199) {
				pricePerCopy = 1200;
			}
			if (copySelection >= 200 && copySelection <= 499) {
				pricePerCopy = 1100;
			} else {
				pricePerCopy = 1000;
			}
		}

		pricePerCopy = pricePerCopy * copySelection;

		return pricePerCopy;
	}


	public static void MultiplicationTable(int number, int multiply) {

		System.out.print(" ");
		for (int i = number; i <= multiply; i++ ){
			System.out.printf("%3d", i);
		}
		System.out.println( );

		System.out.println("-----------------------------------------------------------\n");
		System.out.println( );

		for (int i = number; i <= multiply; i++) {
			System.out.printf("%2d|", i);
			for (int j = number; j <= multiply; j++){
				System.out.printf("%3d", i * j);
			}
		System.out.println( );
		}

		
		
	}
}