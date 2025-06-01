import java.util.Scanner;
public class Result {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int passes = 0;
		int fails = 0;
		int resultCounter = 1;

		while (resultCounter <= 10) {
			System.out.println("Enter result value: ");
			int result = input.nextInt();

			if (result == 1) {
				passes = passes + 1;
			} else {
				if (result == 2) {
					fails = fails + 1;
				}
			}
			
			resultCounter = resultCounter + 1;
		} 

			System.out.printf("Passed: %d%n  failed: %d ", passes, fails);
		
			if (passes > 8) {
				System.out.println("Bonus to the Instructor! ");
			} else {
				System.out.println("Bad Outcome!");
			}


	}
}