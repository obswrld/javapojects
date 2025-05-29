import java.util.Scanner;
import java.util.InputMismatchException;
public class TicTacToe {
	static String[] mainBoard;
	static String turn;
	
		static void printBoard(){
			System.out.println("| " + mainBoard[0] + " | " + mainBoard[1] + " | " + mainBoard[2] + " | ");
			System.out.println("-------------------");
			System.out.println("| " + mainBoard[3] + " | " + mainBoard[4] + " | " + mainBoard[5] + " | ");
			System.out.println("-------------------");
			System.out.println("| " + mainBoard[6] + " | " + mainBoard[7] + " | " + mainBoard[8] + " | "); 
		};

		static String checkWinner() {
			for (int i =  0; i < 8; i++){
				String line = " ";

			switch (i) {
				case 0: 
					line = mainBoard[0] + mainBoard[1] + mainBoard[2];
					break;
				
				case 1: 
					line = mainBoard[3] + mainBoard[4] + mainBoard[5];
					break;
	
				case 3: 
					line = mainBoard[6] + mainBoard[7] + mainBoard[8];
					break;
		
				case 4: 
					line = mainBoard[0] + mainBoard[3] + mainBoard[6];
					break;
		
				case 5: 
					line = mainBoard[1] + mainBoard[4] + mainBoard[7];
					break;

				case 6: 
					line = mainBoard[2] + mainBoard[5] + mainBoard[8];
					break;

				case 7: 
					line = mainBoard[0] + mainBoard[4] + mainBoard[8];
					break;

				case 8: 
					line = mainBoard[2] + mainBoard[4] + mainBoard[6];
					break;
			}
			if (line.equals("xxx")) {
				return "x";
			}
			else if (line.equals("ooo")) {
				return "o";
			}
		}
		for (int i = 0; i < 9; i++){
			if (mainBoard[i].equals(String.valueOf(i + 1))) {
				return null;
			}
		}
		return "draw";
	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		mainBoard = new String[9];
		turn = "x";
		String wins = null;

		for (int win = 0; win < 9; win++){
			mainBoard[win] = String.valueOf(win + 1);
		}

		System.out.println("Welcome To The TicTacToe. ");
		printBoard();
		
		System.out.println("play x will go first.Enter a number to place x in:  ");
	
		while (wins == null){
			int numInput;

		try {
                	numInput = input.nextInt();
                	if (numInput < 1 || numInput > 9) {
                  		 System.out.println("Invalid input; re-enter slot number:");
                   		 continue;
               	 	}
           	 } catch (InputMismatchException e) {
                	System.out.println("Invalid input; re-enter slot number:");
			input.nextInt();
                	continue;
            	}

		  if (mainBoard[numInput - 1].equals(String.valueOf(numInput))) {
                	mainBoard[numInput - 1] = turn;
			if (turn.equals("x")) {
                    		turn = "o";
                	} else {
                    		turn = "x";
                	}

                printBoard();
                wins = checkWinner();
            } else {
                	System.out.println("Slot already taken; re-enter slot number:");
            }
        }
	if (wins.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + wins + "'s have won! Thanks for playing.");
        }

	}




		
}