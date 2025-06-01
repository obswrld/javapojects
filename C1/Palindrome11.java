import java.util.Scanner;
public class Palindrome11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter A Number:  ");
		int number = input.nextInt();

		int reverseNumber = 0;
		int temp = number;
		int remainder;

		while(temp > 0) {
			remainder = temp % 10;
			reverseNumber = reverseNumber * 10 + remainder;
		
			temp = temp / 10;	
		} 
			if (number == reverseNumber) {
				System.out.println("it is a Palindrome Number.");
			} else {
				if (number != reverseNumber) {
					System.out.println("it is not a Palindrome Number.");
				}
			}
	}
}