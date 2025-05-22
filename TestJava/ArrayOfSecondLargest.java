import java.util.Scanner;
import java.util.Arrays;
public class ArrayOfSecondLargest{
	/*public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of Numbers:   ");
		int amount = input.nextInt();

		int[] numbers = new int[amount];	
		System.out.println("Enter the " + amount + " numbers:  ");

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}

		System.out.println("The secondLargest Value is:   " + ArrayFunctionOfSecondLargest(numbers));

	}*/

	public static int ArrayFunctionOfSecondLargest(int[] arrayOfIntegers){
		int max = -888;
		int secondMax = -888;

		for(int num : arrayOfIntegers){
			if(num > max && num > secondMax){
				secondMax = max;
				max = num;
			}
			if(num > secondMax && num != max){
				secondMax = num;
			}
		}

		return secondMax;
	}
}