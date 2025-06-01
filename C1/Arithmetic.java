import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] Arithmetic) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Integer: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Integer: ");
		int secondNumber = input.nextInt();

		int firstSquare = firstNumber * firstNumber;
		int secondSquare = secondNumber * secondNumber;

		int sumOfSquares = firstSquare + secondSquare;

		int differentOfSquares = firstSquare - secondSquare; 


		System.out.printf("square of %d%n%d%n", firstNumber, firstSquare);
		System.out.printf("square of %d%n%d%n", secondNumber, secondSquare);
		System.out.printf("sum of squares: %d%n", sumOfSquares);
		System.out.printf("different of squares: %d%n", differentOfSquares);

	}
}

		