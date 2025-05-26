
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArrayOfSecondLargestTest{

	@Test
	public void testThatSecondLargestIsCorrect() {
		int[] input = {10, 9, 5, 7, 6};
		int expected = 9;

		ArrayOfSecondLargest scanner = new ArrayOfSecondLargest();
		int actual = scanner.ArrayFunctionOfSecondLargest(input);

		assertEquals(expected, actual); 
	}

	@Test
	public void testThatSecondLargestCollectsNegativeNumbers() {
		int[] input = {-10, -9, -8, 10, -7};
		int expected = -7;

		ArrayOfSecondLargest scanner = new ArrayOfSecondLargest();
		int actual = scanner.ArrayFunctionOfSecondLargest(input);

		assertEquals(expected, actual);
	}
}