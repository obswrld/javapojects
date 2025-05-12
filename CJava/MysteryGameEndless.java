import java.util.Scanner;
public class MysteryGameEndless{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int compInput = (int)((Math.random() * 10) + 1);
	
	System.out.println("Welcome to the Mystery Game!");

	int guess = 0;
	
	
	while(true) {

		System.out.println("Enter your Guess number: ");
		guess = input.nextInt();

		if (guess < 1 && guess > 10) {
			System.out.println("Please enter a valid number.");
		} else {
			if (guess < compInput) {
				System.out.println("Opps! too low. Please try again.");
				}  else if (guess > compInput) {
							System.out.println("Opps! too high. Please try again.");
					} else if (guess == compInput) {
								System.out.print("Great!!! you guessed right.");
								break;
					}
					
			}
	}
	
	























	}
}