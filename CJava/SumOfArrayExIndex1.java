import java.util.Scanner;
import java.util.Arrays;
public class SumOfArrayExIndex1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Amount of Numbers:   ");
		int amount = input.nextInt();

		int[] numbers = new int[amount];
		
		int[] sum = new int[numbers.length];
		int[] index = new int[numbers.length];


		int[] maximum = new int[numbers.length];
		int[] minimum = new int[numbers.length];

		System.out.println("Enter the " + amount + " numbers inputed");

		for (int counter = 0; counter < numbers.length; counter++){
			numbers[counter] = input.nextInt();

			for (int count = 0; count < length; count++) {
				if (numbers[counter] != numbers[count]){
					sum = sum + numbers[counter];
				}
			}

			if (sum > maximum) {
				maximum = sum;
			}
			if (sum < minimum) {
				minimum = sum;
			}
			
		}

		System.out.println(maximum, minimum);
	}
}