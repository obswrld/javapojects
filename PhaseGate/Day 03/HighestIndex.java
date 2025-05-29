public class HighestIndex{
	public static int highestIndex(int[] numbers){
		int max = numbers[0];
		int index = 0;
		
		for (int i = 1; i < numbers.length; i++){
			if (numbers[i] > max){
				max = numbers[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args){
		int [] numbers = {1, 5, 6, 7, 7};
		System.out.println(highestIndex(numbers));
	}
}