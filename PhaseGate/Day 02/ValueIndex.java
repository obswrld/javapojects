import java.util.Arrays;
public class ValueIndex{


	public static boolean IndexDigits(int[] numbers){
	String [] number = Integer.toString(numbers);
	
		for (int index = 0; index<= numbers.length(); index++){
			String num = Integer.toString(index);
			int counter1 = 0;
			for (int count = 0; count < numbers.length(); count++){
				String nums = "" + nuumber.charAt(count);

				if num .equal(nums){
					counter1++;
				}
			}
			if (counter1 > 0){
				counter2++;
			}
		}
		return counter1;
	}	

	public static void main(String[] args){
		int[] num = {2, 3, 4, 1};
		int[] result = IndexDigits(num);

		System.out.println(Arrays.toString(result));
	}
}