import java.util.Scanner;
import java.util.Arrays;
public class SubtractionOfMaxAndMinValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Number Of Integers:  ");
		int number = input.nextInt();
	
		int[] numbers = new int[number];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter " + i + " number:   ");
			numbers[i] = input.nextInt();
		}

		System.out.println(ArrayKata.subtractionOfMaxAndMin(numbers));
	}
}