import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter An Integer:  ");
		int number = input.nextInt();

		int pos = 0;
		int neg = 0;
		int total = 0;
		int counter = 1;
		float ave = (float) total / counter;

		

		while (number != 0) {

			if (number > 0) {
				pos++;
			}
			else if (number < 0) {
				neg++;
			}
			total = total + number;
			
			ave = (float) total / counter;

			System.out.println("Enter an Integer:  ");
			number = input.nextInt();
		counter = counter + 1;
		}

			System.out.println("The number of positive integers:  " + pos);
			System.out.println("The number of negative integers:  " + neg);
			System.out.println("The total Number of Integers:  " + total);
			System.out.printf("The average number is: %.2f", ave);

		
	}
}