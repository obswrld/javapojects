import java.util.Scanner;
public class Multiple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		

		int num3 = number1 * 3;
		int num2 = number2 * 2;

		if (num3 % num2 == 0) {
			System.out.printf("%d is a multiple of %d", num3, num2);
		}
		
		if (num3 % num2 != 0) {
			System.out.printf("%d is not a multiple of %d", num3, num2);
		}
}
}