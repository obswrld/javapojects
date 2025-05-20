import java.util.Scanner;
import java.util.Arrays;
public class ArrayOfHighestAndLowest{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Please Enter Number Of Students:   ");
	int amount = input.nextInt();

	int[] numbers = new int[amount];

	System.out.println("Enter the " + amount + " number of Students");

	for (int count = 0; count < numbers.length; count++) {
		numbers[count] = input.nextInt();
	}

	System.out.println(Arrays.toString(ArrayKata.subtractionOfMaxAndMin(numbers)));
}
}