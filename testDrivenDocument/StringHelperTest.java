import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringHelperTest{
	

	@Test
	public void testStrWithCharIsReversed() {
		StringHelper helper = new StringHelper();
		assertEquals("BA", helper.swapLast2Chars("AB"));
	}
}