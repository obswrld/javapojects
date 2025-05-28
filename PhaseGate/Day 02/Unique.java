public class Unique{
	public static int uniqueOfNumbers(int[] numbers){
		
		int uniqueCount = 0;

		for(int i = 0; i < numbers.length; i++){
			int count = 0;			
			for (int j = 0; j < numbers.length; j++){
				if(numbers[i] == numbers[j]){
					count++;
				}
			}
			if (count == 1){
					numbers[i] = uniqueCount;
					uniqueCount++;
					
			}
		}
		return  uniqueCount;
	} 

	public static void main(String[] args){
		int[] nums = {1, 2, 2, 3};
		System.out.println(uniqueOfNumbers(nums));
	}
}