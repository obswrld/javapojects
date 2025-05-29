public class Factors{
	public static int[] factors(int numbers){
		int num = numbers;

		for (int i = 0; i <= num; i++){
			if (num % i == 0){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		return num;
	}

	public static void main(String[] args){
		int number = 7;
		int result = number;
		System.out.println(factors(result));
	}
}