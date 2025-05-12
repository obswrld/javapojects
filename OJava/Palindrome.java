import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number:  ");
		int number = input.nextInt();

		int remainder;
		int reverseNumber = 0;
		int temp = number;

		while (temp > 0) {
			remainder = temp % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			temp = temp / 10;
		}

		if (number == reverseNumber) {
			System.out.println("Number is a Palindrome");
		} else {
			if (number != reverseNumber) {
				System.out.println("Number is not a Palindrome");
			}
		}
	}
}