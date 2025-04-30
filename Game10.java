import java.util.Scanner;
public class Game10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int compInput = (int)((Math.random() * 3) + 0);
		
		int strike = 0;
		int compWin = 0;
		int strikeWin = 0;

		while (true) {
			System.out.println("Strike your choice: ");
			strike = input.nextInt();


			if (strike != 1 && strike != 2 && strike != 0) {
				System.out.println("Please enter the valid value.");
				break;
			} else if (strike == 1 && compInput == 0) {
					System.out.println("You are scissors. Computer is rock. computer won!");
					compWin = compWin + 1;
				}
			else	if (strike == 1 && compInput == 1) {
					System.out.println("You are Scissors. Computer is scissors. its a draw!");
				}
			else	if (strike == 1 && compInput == 2) {
					System.out.println("You are Scissors. Computer is paper. You won!");
					strikeWin = strikeWin + 1;
				}
			else if (strike == 0 && compInput == 0) {
					System.out.println("You are rock. Computer is rock. its a draw!");
				}
			else if (strike == 0 && compInput == 1) {
					System.out.println("You are rock. Computer is scissors. You won!");
					strikeWin = strikeWin + 1;
				}
			else if (strike == 0 && compInput == 2) {
					System.out.println("You are rock. Computer is paper. Computer won!");
					compWin = compWin + 1;
				}
			else if (strike == 2 && compInput == 0) {
					System.out.println("You are paper. computer is rock. You won!");
					strikeWin = strikeWin + 1;
				}
			else if (strike == 2 && compInput == 1) {
					System.out.println("You are paper. Computer is scissors. Computer won!");
					compWin = compWin + 1;
				}
			else if (strike == 2 && compInput == 2) {
					System.out.println("You are paper. Computer is paper. its a draw!");
				}

				if (strikeWin == 3) { 
					System.out.printf("You win!!!");
					break;
				}
				if (compWin == 3) {
					System.out.println("Computer Wins !!!");
					break;
				}

				
				compInput = (int)((Math.random() * 3) + 0);	
			
		} 


















	}


}