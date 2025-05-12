import java.util.Scanner;
public class Decimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Number:  ");
		int number = input.nextInt();

		int binary = 0;
		int counter = 0;
		while (number > 0) {
			binary = number % 2;
			number = number / 2;
		counter = counter + 1;
		}
			System.out.print(binary);
	}
}