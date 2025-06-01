import java.util.Scanner;
public class TrueValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Three Integers: ");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		int thirdNumber = input.nextInt();

		if (thirdNumber > secondNumber && secondNumber > firstNumber) {
			System.out.print("The result is true");
		}
	}
}