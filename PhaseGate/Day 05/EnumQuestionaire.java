import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class EnumQuestionaire {

	public static void main(String[] args){
		String[] questions = {
			"What is the capital of Spain?",
			"What year was Ronaldo born?",
			"Who was the first african to win the balon dor?",
			"Who is the first nigerian female artist to win the grammy award?",
			"Which team won the uefa champions league in the year 2004?",
			"What is the capital of Delta state?",
			"How many Kids does Luka modric have?",
			"What is the capital of netherland?",
			"Which of these england clubs is not a london based club?",
			"What is the capital of italy?"
		};
		String[][] options  = {
			{"A. London", "B. Barcelona", "C. Valencia", "D. Madrid"},
			{"A. 1984", "B. 1997", "C. 1987", "D. 1991"},
			{"A. Didier Drogba", "B. Samuel Eto", "C. Goerge weah", "D. Okocha Jayjay"},
			{"A. Tiwa Savage", "B. Yemi Alade", "C. Ayra Star", "D. Tems"},
			{"A. AC Milan", "B. Porto", "C. Bayern Munich", "D. Real Madrid"},
			{"A. Asaba", "B. Warri", "C. Sapele", "D. Benin"},
			{"A. 2", "B. 5", "C. 3", "D. 4"},
			{"A. Berlin", "B. Amsterdam", "C. Lisbon", "D. Monaco"},
			{"A. Crystal Palace", "B. Everton", "C. Fulham", "D. Arsenal"},
			{"A. Atalanta", "B. Lisbon", "C. Milan", "D. Rome"}
		};
		char[] answer = {'D', 'A', 'C', 'C', 'B', 'A', 'C', 'B', 'B', 'D'};
		int score = 0;

		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome To Questioniare");
		for (int i = 0; i < questions.length; i++){
			System.out.println("Enter Any number from 1 - 10:  ");
			int userInput = input.nextInt();
			if (userInput > questions.length){
				System.out.println("Please enter a valid Number");
			}else{
				int randomIndex = random.nextInt(questions.length);
				System.out.println(questions[randomIndex]);
				System.out.println(Arrays.toString(options[randomIndex]));
				char userAnswer;
				int attempt = 2;
				while (attempt > 0){
					System.out.println("Your answer:   ");
					userAnswer = input.next().toUpperCase().charAt(i);

					if (userAnswer == answer[randomIndex]){
						System.out.println("Very Good");
						score++;
						break;
					} else{
						attempt--;
						if (attempt > 0){
							System.out.println("Incorrect answer, You have " + attempt + " attempts left.");
						} else{
							System.out.println("I'm sorry. No attempts left.");
						}
					}
				}
			}
		System.out.println("Enter a number for another question:   ");
		}
		
	}	
}