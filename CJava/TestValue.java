import java.util.Scanner;
public class TestValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		int num1 = input.nextInt();

		System.out.print("Enter second Number: ");
		int num2 = input.nextInt();

		int output = num1 * num2;
		
		System.out.println("Expected output is " + output);
	}
}