import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class TicTacToeTest{
	private TicTacToe game;

	@Test
	public void testBoardInitializationWorks(){
		game.mainBoard = new String[9];
		for(int i = 0; i < 9; i++){
			game.mainBoard[i] = String.valueOf(i + 1);
		}
		assertArrayEquals(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, game.mainBoard);
		
	}

	@Test
	public void testCheckWinnerRow(){
		game.mainBoard = new String[]{"x", "x", "x", "4", "5", "6", "7", "8", "9"};
		assertEquals("x", game.checkWinner());

		game.mainBoard = new String[]{"o", "o", "o", "4", "5", "6", "7", "8", "9"};
		assertEquals("o", game.checkWinner());
	}
	
	@Test
	public void testCheckWinnerColumn(){
		game.mainBoard = new String[]{"x", "2", "3", "x", "5", "6", "x", "8", "9"};
		assertEquals("x", game.checkWinner());
		
		game.mainBoard = new String[]{"o", "2", "3", "4", "o", "6", "7", "8", "o"};
		assertEquals("o", game.checkWinner());
	}

	@Test 
	public void testDrawCondition(){
		game.mainBoard = new String[]{"x", "o", "x", "o", "x", "o", "o", "x", "o"};
		assertEquals("draw", game.checkWinner());
	}

	@Test
	public void testCheckWinnerDiagonal(){
		game.mainBoard = new String[]{"x", "2", "3", "4", "x", "6", "7", "8", "x"};
		assertEquals("x", game.checkWinner());
	
		game.mainBoard = new String[]{"o", "2", "3", "4", "o", "6", "7", "8", "o"};
		assertEquals("o", game.checkWinner());
	}
}