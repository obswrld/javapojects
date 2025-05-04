public class Munchies {


	// 5th multiples of number function 
	public static int multiple(int number) {
			return number * 5;		
	}




	public static int sumOfNumbers(int number) {

		if (number < 1000 || number > 9999) {
			System.out.println("Invalid input");
		}
		
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
	
			return sum;

	}
}