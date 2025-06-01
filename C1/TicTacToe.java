import java.util.Scanner;
public class TicTacToe {
	private char[][] board;
	private char currentPlayer;

	public TicTacToe() {
		board = new char[3][3];
		currentPlayer = 'x';
		initializeBoard();
	}

	public void initializeBoard() {
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				board[i][j] = '-';
			}
		}
	}

	public void printBoard() {
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean makeMove(int row, int col){
		if (row >= 0 && row < 3 && col >=0 && col < 3 && board[row][col] == '-'){
			board[row][col] = currentPlayer;
			return true;
		}
		return false;
	}

	public boolean checkWin() {
		for (int i = 0; i < 3; i++){
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer){
				return true;
			}
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer){
				return true;
			}
		}
		return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) || (board[0][2] == currentPlayer && board[1][1] == 					currentPlayer && board[2][0] == currentPlayer);
	}

	public void switchPlayer() {
		currentPlayer = (currentPlayer == 'x') ? 'o' : 'x';
	}

	public static void main(String[] args){
		TicTacToe game = new TicTacToe();
		Scanner input = new Scanner(System.in);
		boolean gameWon = false;

		while (!gameWon) {
			game.printBoard();
			System.out.println("Player " + game.currentPlayer + ", enter your move:  ");
			int row = input.nextInt();
			int col = input.nextInt();

			if (game.makeMove(row, col)) {
				gameWon = game.checkWin();
				if (!gameWon){
					game.switchPlayer();			
				}
			} else {
				System.out.println("This move is not valid");
			}
		} 
		System.out.println("Player " + game.currentPlayer + " wins!");
		game.printBoard();
	}

}