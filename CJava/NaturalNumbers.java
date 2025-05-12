import java.util.Scanner;
public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int counter = 1;

		while (counter <= 10) {
			sum = sum + counter;
			counter = counter + 1;
		}
		System.out.println("Print the sum of the first 10 natural numbers: " + sum);
	


	}
}