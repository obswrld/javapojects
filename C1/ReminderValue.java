import java.util.Scanner;
public class ReminderValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the First Integer: ");
		int num1 = input.nextInt();

		System.out.print("Enter the Second Integer: ");
		int num2 = input.nextInt();

		if (num1 == num2) {
			System.out.println("0");
		} else if (num1 % 6 == num2 % 6) {
			if (num1 > num2) {
				System.out.println(num1 + "is the larger value.");
			} else {
				System.out.println(num2 +"is the larger value.");
			} else if (num1 > num2) {
				System.out.println(num1 + "is the larger value.");
			} else {
				System.out.println(num2 + "is the larger value.");
				}
		}
	}
}