import java.util.Scanner;
public class Print {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");

		int variable = input.nextInt();

		if (variable != 7) {
			System.out.println("The variable is not equal to 7");
		} else {
			System.out.println("The variable is equal to 7");
		}
}
}