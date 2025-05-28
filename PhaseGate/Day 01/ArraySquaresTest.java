import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArraySquaresTest{

	@Test
	public void SquareOfArrayIsCorrect() {
		int [] input = {9, 2, 7, 0, 5};
		int [] expected = {0, 4, 25, 49, 81};

		SquaredArray square = new SquaredArray();
		int [] actual = square.squaredArray(input);

		assertArrayEquals(expected, actual);
	}

	@Tests
	public void SquareOfArrayIsTakingNegativeValues() {
		int [] input = {-9, 2, -7, 0, 5};
		int [] expected = {0, 4, 25, 49, 81};

		SquaredArray square = new SquaredArray();
		int [] actual = square.squaredArray(input);

		assertArrayEquals(expected, actual);
	}
} 