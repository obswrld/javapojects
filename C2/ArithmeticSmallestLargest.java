 import java.util.Scanner;

	public class ArithmeticSmallestLargest {
		public static void main(String[] ArithmeticSmallestLargest) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter first integer: ");
			int firstNumber = input.nextInt();

			System.out.print("Enter second integer: ");
			int secondNumber = input.nextInt();

			System.out.print("Enter third integer: ");
			int thirdNumber = input.nextInt();

			int sum = firstNumber + secondNumber + thirdNumber;

			int average = sum / 3;

			int product = firstNumber * secondNumber * thirdNumber;

			int smallest = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
			int largest = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));

			System.out.printf("sum %d%n:", sum);
			System.out.printf("average %d%n:", average);
			System.out.printf("product %d%n:", product);
			System.out.printf("smallest %d%n:", smallest);
			System.out.printf("largest %d%n:", largest);

	}
}

