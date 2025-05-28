import java.util.Arrays;
public class SquaredArray {
	public static int[] squaredArray(int[] numbers){
		int[] squareNumber = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++){
			squareNumber[i] = numbers[i] * numbers[i];
		}
		return squareNumber;
	}

	public static int[] sortNumber(int[] numbers){
		for (int i = 0; i < numbers.length - 1; i++){
			for (int j = 0; j < numbers.length - 1 - i; j++){
				if(numbers[j] > numbers[j + 1]){
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		
			return numbers;
	}



	public static void main(String[] args){
		int [] numbers = {-9, 2, -0, 0, -10000};
		int [] squares = squaredArray(numbers);
		int [] result = sortNumber(squares);

		System.out.print(Arrays.toString(result));
	}
}