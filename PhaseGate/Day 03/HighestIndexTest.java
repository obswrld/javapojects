import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestIndexTest{
	
	@Test
	public void testThatHighestIndexIsCorrect() {
		int[] input = {10, 4, 9, 10, 4, 10000};
		int expected = 5;

		HighestIndex scanner = new HighestIndex();
		int actual = scanner.highestIndex(input);

		assertEquals(expected, actual);
	}

	@Test
	public void testThatHighestIndexCollectsNegativeNumbers(){
		int[]  input = {-10, -8, -9, -7, -5};
		int expected = 4;

		HighestIndex scanner = new HighestIndex();
		int actual = scanner.highestIndex(input);

		assertEquals(expected, actual);
	}
}