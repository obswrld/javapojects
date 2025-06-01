public class PowerIntegers {
	public static void main(String[] args) {

	int a = 1;
	int b = 2;
		double square;
		System.out.printf("%s\t%s\t%s\t\n", "A", "B", "C");

		while (a <= 5) {
		b = a + 1;
		square = Math.pow(a, b);
		int intSquare = (int) square;
		System.out.printf("%d\t%d\t%d\t\n", a, b, intSquare);

		a = a + 1;

		}
		

	



	}
}