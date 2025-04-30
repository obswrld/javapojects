import java.util.Scanner;
public class ClassScore2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Number of Students: ");
		int number = input.nextInt();

		String name = input.nextLine();
		int score = 0;

		int highestScore1 = 0;
		String name1 = " ";
		int highestScore2 = 0;
		String name2 = " ";
		

	 		for (int counter = 1; counter <= number; counter++) {


			System.out.println("Enter the Student Name: ");
			name = input.next();
			
			System.out.println("Enter Student Score: ");
			score = input.nextInt();

			if (score > highestScore1) {


				highestScore2 = highestScore1;
				name2 = name1;

				highestScore1 = score;
				name1 = name;

			
				
			}	
	
			else if (score > highestScore2) { 
					highestScore2 = score;
					name2 = name;
			}
			
		}

			System.out.println(name1 + " Has the Highest score: " + highestScore1);
			System.out.println(name2 + "Has the second highest score: " + highestScore2);
	}
}