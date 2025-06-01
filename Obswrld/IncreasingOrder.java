import java.util.Scanner;
public class IncreasingOrder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first Number");
		int number1 = input.nextInt();
		
		System.out.println("Enter second Number");
		int number2 = input.nextInt();
		

		System.out.println("Enter third Number");
		int number3 = input.nextInt();
		

		int increase;
		if(number1 > number2) {
			increase = number1;
			number1 = number2;
			number2 = increase;
		}
		if (number1 > number3) {
			increase = number1;
			number1 = number3;
			number3 = increase;
		}
		if (number2 > number3) {
			increase = number2;
			number2 = number3;
			number3 = increase;
		}

		System.out.println("Output : " + number1 + ", " + number2 + ", " + number3);
		
	}
}