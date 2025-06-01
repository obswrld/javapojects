public class TestTable {
	public static void main(String[] args) {
		System.out.printf("%s\t%s\t%s\t\n", "A", "B", "A**B");

		int b = 2;
		for (int a = 1; a <= 5; a++){
			b = a + 1;
			double square = Math.pow(a, b);
			int square2 = (int) square;

			System.out.printf("%d\t%d\t%d\t\n", a, b, square2);
		}		
	}
}