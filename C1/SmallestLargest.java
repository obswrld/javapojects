import java.util.Scanner;
public class SmallestLargest {
	public static void main(String[] SmallestLargest) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Integer: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter Second Integer: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter Third Interger: ");
		int thirdNumber = input.nextInt();

		System.out.print("Enter Fourth Integer: ");
		int fourthNumber = input.nextInt();

		System.out.print("Enter Fifth Integer: ");
		int fifthNumber = input.nextInt();	

		if (firstNumber >= secondNumber && thirdNumber && fourthNumber && fifthNumber) {
			System.out.printf("Largest number is %d", firstNumber);
		}
	}
}