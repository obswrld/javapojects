import java.util.Scanner;
public class Maths {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int square = number * number;
		

		if (square > 100) {
			System.out.println("This is greater than 100");
		}
		if (square < 100) {
			System.out.println("This is less than 100");
		}
		if (square == 100) {
			System.out.println("This is equal to 100");
		}
		if (square != 100) {
			System.out.println("This is not equal to 100");
		}
	}
}