import java.util.Scanner;
public class Days{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Today's Day:  ");
		int today = input.nextInt();

		int todayElapsed = 0;

		if (today < 0 || today > 6) {
			System.out.println("Enter Valid day of the week");
		} else{

			System.out.println("Enter the number of days elapsed since today:  ");	
			todayElapsed = input.nextInt();

			if (todayElapsed < 0 && todayElapsed > 6) {
				System.out.println("Enter Valid day of the week");
			} 

			int output = (today + todayElapsed) % 7;

			String today1 = daysOfTheWeek(today);
			String todayElapsed1 = daysOfTheWeek(output);

			System.out.println("Today is " + today1 + " and the future day is " + todayElapsed1);

		}
	}	

	public static String daysOfTheWeek(int number){
		if (number == 0){
			return "Sunday";
		} else if (number == 1) {
			return "Monday";
		} else if (number == 2) {
			return "Tuesday";
		} else if (number == 3) {
			return "Wednesday";
		} else if (number == 4) {
			return "Thursday";
		} else if (number == 5) {
			return "Friday";
		} else if (number == 6) {
			return "Saturday";
		} else {
			return "Invalid Input";
		}
		
	}
}