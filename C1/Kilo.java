import java.util.Scanner;
public class Kilo {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Enter number in pounds: ");
		double n = input.nextDouble();

		double xkg = n * 0.454;
		
		System.out.printf("Display result which is %.3f", xkg);
}
}