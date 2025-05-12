import java.util.Scanner;
public class Coin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Generating number from 1 to 2: ");
		int compGuess = (int)((Math.random() * 2) + 1);
		
		System.out.println("Enter a value to roll your dice: ");
		int dice = input.nextInt();
		if (dice != 1 && dice != 2) {
			System.out.println("Invalid Value!");
		} else {
			if (dice == compGuess) {
				System.out.println("Correct!.");	
				} else {
					if (dice != compGuess) {
						System.out.println("Incorrect!.");
					}
				}
		}
		
	}
}