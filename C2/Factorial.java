import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a Number: ");
	int number = input.nextInt();

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

	

	






	}
}