import java.util.Scanner;
public class ProductSumValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Two Integer Values: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int product = num1 * num2;
		int sum = num1 + num2;

		if (num1 > 0 && num2 > 0) {
			System.out.println("Product" + product);
		} else if (num1 < 0 && num2 < 0) {
			System.out.println("Product" + product);
		} else {
			System.out.println("Sum" + sum);
		}
}
}