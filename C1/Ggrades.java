import java.util.Scanner;
public class Ggrades {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter grade or -1 to stop: ");
		int grade = input.nextInt();

		
		int total = 0;
		int gradeCounter = 1;

		while (grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;

			System.out.println("Enter grade or -1 to stop: ");
			grade = input.nextInt();
		}

		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;
			System.out.printf("%nThe total %d of the entered is:  %d%n ", gradeCounter, total);
			System.out.printf("The average is:  %.2f%n", average);
		}else {
			System.out.println("No grades were entered here. ");
		}
	}
}