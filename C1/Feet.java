import java.util.Scanner;
public class Feet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter value for feet: ");
		double n = input.nextDouble();

		double xkg = n * 0.305;

		System.out.printf("value for feet is %.4f", xkg);
}
}