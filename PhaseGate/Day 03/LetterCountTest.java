import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCountTest{

	@Test
	public void testThatLetterCountIsCorrect(){
		String word = "basketball";
		char alpha = 'b';
		int expected = 2;

		LetterCount scanner = new LetterCount();
		int actual = scanner.letterCount(word, alpha);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testThatLetterCountIsCollectingSmallAndBigCases(){
		String word = "bAsketballA";
		char alpha = 'm';
		int expected = 0;

		LetterCount scanner = new LetterCount();
		int actual = scanner.letterCount(word, alpha);
		
		assertEquals(expected, actual);
	}
}