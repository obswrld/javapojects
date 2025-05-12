import java.util.Scanner;
public class DoLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char continueOperation;

			do {
				System.out.println("Enter First Number: ");
				int num1 = input.nextInt();
			
				System.out.println("Enter Second Number: ");
				int num2 = input.nextInt();

				int sum = num1 + num2;
				System.out.println("Sum of the Integers: " + sum);

				System.out.println("Do you want to continue ? (y/n): ");

				continueOperation = input.next().charAt(0);
			}

				while (continueOperation == 'y' && continueOperation == 'Y') {
					System.out.println("Operation terminated.");

				else {
						
				}
					System.out.println("Enter First Number: ");
				int num1 = input.nextInt();
			
				System.out.println("Enter Second Number: ");
				int num2 = input.nextInt();

				int sum = num1 + num2;
				System.out.println("Sum of the Integers: " + sum);

				System.out.println("Do you want to continue ? (y/n): ");

				continueOperation = input.next().charAt(0);

				}
		
	}
}