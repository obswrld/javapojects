import java.util.Scanner;
public class LargestValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter First Integer: ");
		int input1 = input.nextInt();

		System.out.print("Enter Second Integer: ");
		int input2 = input.nextInt();

		int difference = input1 - input2;

		if (input1 > input2) {
			System.out.println("Difference  " + difference);
		}
	}
}