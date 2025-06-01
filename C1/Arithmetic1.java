import java.util.Scanner;

public class Arithmetic1 {
	public static void main(String[] Arithmetic1) {
	
		Scanner input = new Scanner(System.in);
		
		int x = 100;

		System.out.print("Enter first Integer: ");
		int number = input.nextInt();

		int numberSquare = number * number;

		if (numberSquare > x) {
			System.out.printf("%d > %d%n", numberSquare, x);
		}
		if (numberSquare < x) {
			System.out.printf("%d < %d%n", numberSquare, x);
		}
	}
}

		