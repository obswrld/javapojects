import java.util.Scanner;
import java.util.Arrays;
public class AscendingOrder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter amount of numbers");
		int number = input.nextInt();

		int[] numbers = new int[number];
		
		System.out.println("Enter the " + number + " numbers:   ");

		for (int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		
			System.out.println(Arrays.toString(ArrayKata.sortNumbers(numbers)));
	}
		
}