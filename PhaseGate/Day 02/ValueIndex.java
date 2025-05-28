import java.util.Arrays;
public class ValueIndex{


	public static int IndexDigits(int[] numbers){
	int [] number = new int[number.length];
	
		for (int index = 0; index<= number.length; index++){
			int count = 0;
			for (int digit = 0; digit < number.length; digit++){
				if(index[number.length] == digit){
					count++;
					System.out.println("At index " + index[number.length] + " the digit " + " appeared " + count + " times");
				}
			}
		}
	}	

	public static void main(String[] args){
		int[] num = {2, 3, 4, 1};
		int[] result = IndexDigits(num);

		System.out.println(Arrays.toString(result));
	}
}