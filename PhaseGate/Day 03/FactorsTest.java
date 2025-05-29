import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultipleTest{
	
	
	@Test
	public void testThatFactorsIsCorrect(){
		int input = 7;
		int[] expected = {1, 7};

		Factors scanner = new Factors();
		int[] actual = scanner.factors(input);
	
		assertEquals(expected, actual);
	}

	@Test
	public void testThatFactorsGetsForNegative(){
		int input = -7;
		int[] expected = {-1, -7};

		Factors scanner = new Factors();
		int[] actual = scanner.factors(input);

		assertEquals(expected, actual);
	}
}