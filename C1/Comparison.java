import java.util.Scanner;
public class Comparison {
	public static void main(String[] Comparison){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();

		System.out.print("Enter second Integer: ");
		int number2 = input.nextInt();

		if (number1 == number2) {
		System.out.printf("%d == %d%n", number1, number2);
		}

		if (number1 != number2) {
		System.out.printf("%d != %d%n", number1, number2);
		}

		if (number1 < number2) {
		System.out.printf("%d < %d%n", number1, number2);
		}

		if (number1 > number2) {
		System.out.printf("%d > %d%n", number1, number2);
		}

		if (number1 <= number2) {
		System.out.printf("%d <= %d%n", number1, number2);
		}

		if (number1 >= number2) {
		System.out.printf("%d >= %d%n", number1, number2);
		}
	}
}