import java.util.Scanner;
import java.util.Arrays;
public class SumOfArrayExIndex{
	public static int[] sumOfArrayExIndex(int[] numbers){		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int totalSum = 0;
		for (int counter = 0; counter < numbers.length; counter++){
			totalSum = totalSum + numbers[counter];
		}
		
		for (int count = 0; count < numbers.length; count++) {
			int sum = totalSum - numbers[count];
			
			if(sum > max){
				max = sum;
			}
			if(sum < min){
				min = sum;
			}
		}	
		
		int[] result = {max, min};
		return result;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Amount of Numbers:   ");
		int amount = input.nextInt();

		int[] numbers = new int[amount];
		
		System.out.println("Enter the " + amount + " numbers:   ");
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		
		System.out.println(Arrays.toString(sumOfArrayExIndex(numbers)));

}
}