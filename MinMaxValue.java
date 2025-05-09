import java.util.Scanner;
public class MinMaxValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the First Integer: ");
		int num1 = input.nextInt();

		System.out.print("Enter the Second Integer: ");
		int num2 = input.nextInt();


		int sum = num1 + num2;
		int product = num1 * num2;
		int average = num1 + num2 / 2;
		int difference = num1 - num2;
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);


		System.out.printf("Sum %d%n: ", sum);
		System.out.printf("product %d%n: ", product);
		System.out.printf("average %d%n: ", average);
		System.out.printf("distance %d%n: ", difference);
		System.out.printf("max number %d%n: ", max);
		System.out.printf("min number %d%n: ", min);
		
	}
}




















