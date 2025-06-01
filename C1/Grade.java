import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int gradeCounter = 1;
		int total = 0;

		while (gradeCounter <= 10) {
			System.out.println("Enter grade: ");
			int num = input.nextInt();

			total = total + num;
			gradeCounter = gradeCounter + 1;
		}
			int average = total / 10;

			System.out.printf("%nTotal of all Grade is %d%n ", total );
			System.out.printf("average of grade is: %d%n ", average);
	}
}