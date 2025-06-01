import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Generating number 0,1 and 2. Representing rock, paper, scissors.");
		int compInput = (int)Math.random() * 3;

		System.out.println("Enter a random number from 0, 1 and 2: ");
		int userInput = input.nextInt();
		
		if (userInput != 1 && userInput != 2 && userInput != 0) {
		System.out.print("Please enter the valid value.");
		} else {
			if (userInput == 1 && compInput == 0) {
				System.out.print("You are scissors. Computer is rock. computer won!");
			}
			if (userInput == 1 && compInput == 1) {
				System.out.print("You are Scissors. Computer is scissors. its a draw!");
			}
			if (userInput == 1 && compInput == 2) {
				System.out.print("You are Scissors. Computer is paper. You won!");
			}
			if (userInput == 0 && compInput == 0) {
				System.out.print("You are rock. Computer is rock. its a draw!");
			}
			if (userInput == 0 && compInput == 1) {
				System.out.print("You are rock. Computer is scissors. You won!");
			}
			if (userInput == 0 && compInput == 2) {
				System.out.print("You are rock. Computer is paper. Computer won!");
			}
			if (userInput == 2 && compInput == 0) {
				System.out.print("You are paper. computer is rock. You won!");
			}
			if (userInput == 2 && compInput == 1) {
				System.out.print("You are paper. Computer is scissors. Computer won!");
			}
			if (userInput == 2 && compInput == 2) {
				System.out.print("You are paper. Computer is paper. its a draw!");
			}
			if (userInput != 0  && compInput != 0) {
				System.out.print("Please enter the valid value.");
			}
		
		} 

	}
}

