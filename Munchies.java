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


	public static String displayAge(int age) {
		int years = age;
		int months = age * 12;
		int days = age * 365;
		int minutes = age * 24 * 60;
		int seconds = minutes * 60;

		return String.format("Age: %d years, %d months, %d days, %d minutes, %d seconds", years, months, days, minutes, seconds);
	}
		
	
	public static String displayDogAge(String name, int humanYears) {
		int dogYears = humanYears * 7;
		System.out.printf("Dogs name:  %s,  Age in Dog years:   %d%n", name, dogYears);

					return name, dogYears;
	}

}