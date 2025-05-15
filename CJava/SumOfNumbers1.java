import java.util.Scanner;
public class SumOfNumbers1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number:  ");
		int number = input.nextInt();
		int sum = 0;
		if (number < 0 || number > 10000) {
			System.out.println("Enter a Vlalid number please.");
		} else{
			while( number > 0){
				sum = sum + number % 10;
				number = number / 10;
			}

			System.out.println("Sum is:  " + sum);
		}
	}
}