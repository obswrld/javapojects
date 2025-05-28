public class UniqueElements{
	public static int uniqueElementOfNumbers(int[] numbers){
		
		int count = ;
		for(int index = 0; index < numbers.length; index++){
			for (int index1 = 0; index1 < numbers.length; index1++){
				if (numbers[index] == numbers[index1]){
					numbers[index] = count;
					System.out.println(count);
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args){
		int[] nums = {1, 2, 7, 2, 1, 3};
		System.out.println(uniqueElementOfNumbers(nums));
	}

}