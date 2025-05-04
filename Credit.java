import java.util.Scanner;
public class Credit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		long accountNumber = input.nextLong();

		System.out.println("Enter begining balance: ");
		long beginBalance = input.nextLong();

		System.out.println("Enter total charges: ");
		int charges = input.nextInt();

		System.out.println("Enter credits: ");
		long credits = input.nextLong();

		System.out.println("Enter your credit limit: ");
		long creditLimit = input.nextLong();


		long newBalance = beginBalance + charges - credits;
		System.out.println("New Balance is:    " + newBalance);

		if (newBalance > creditLimit) {
			System.out.println("Credit limit exceeded.");
		}
		
	}
}