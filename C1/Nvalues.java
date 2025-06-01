import java.util.Scanner;
public class Nvalues {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = 1;
		int n2;
		int n3;
		int n4;

		double square;
		System.out.printf("%s\t%s\t%s\t%s\t\n", "N", "N", "N", "N");

		while (n <= 5) {
			n2 = n * n;
			n3 = n * n * n;
			n4 = n * n * n * n; 

			System.out.printf("%d\t%d\t%d\t%d\t\n", n, n2, n3, n4);
		n = n + 1;
		}
	}
}