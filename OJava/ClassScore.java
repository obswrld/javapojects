import java.util.Scanner;
public class ClassScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Number of Students: ");
		int number = input.nextInt();

		int highestScore = 0;
		int counter = 1;

		String name = null;
		String highest = null;

		while (counter <= number) {


			System.out.println("Enter the Student Name: ");
			name = input.next();
			
			System.out.println("Enter Student Score: ");
			int score = input.nextInt();

			if (score > highestScore) {
				highestScore = score;
				highest = name;
				
			}	
			
			counter = counter + 1;
		}

			System.out.println( highest + " Has the Highest score: " + highestScore);
	}

}