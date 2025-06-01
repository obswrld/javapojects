import java.security.SecureRandom;
import java.util.Scanner;
public class RandomSubtraction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();

		int totalScore = 0;
		int totalQuestion = 10;

		for (int i = 0; i <= totalQuestion; i++){
			int num1 = random.nextInt(100);
			int num2 = random.nextInt(num1 + 1);

			int correctAnswer = num1 - num2;
			boolean answeredCorrectly = false;
			System.out.println("Question " + (i + 1) + " What is " + num1 + " - " + num2);

			for (int attempts = 1; attempts <= 10; attempts++) {
				System.out.println("Attempt " + attempts + ":  Your answer is:  ");
				int userAnswer = input.nextInt();

				if (userAnswer == correctAnswer) {
					System.out.println("Correctly");
					totalScore++;
					answeredCorrectly = true;
					break;
				} else {
					System.out.println("Incorrect. Please try again.");
				}
			}
			if (!answeredCorrectly) {
				System.out.println("The correct answer was:  " + correctAnswer);
			}
		}
			System.out.println("Your Final Score is " + totalScore + " out of " + totalQuestion);
	}
}