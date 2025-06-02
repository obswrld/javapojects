import java.util.Random;
import java.util.Scanner;


public class SubtractionQuestions{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int question2 = 10;
		int questions = 0;
		while (questions < question2){
			int number1 = random.nextInt(1000);
			int number2 = random.nextInt(number1 + 1);

			int correctAnswer = number1 - number2;

			System.out.println("What is " + number1 + " - " + number2 + "  ?:  ");

			int attempts = 2;
			while(attempts > 0){
				System.out.println("Your answer is:  ");
				int userAnswer = input.nextInt();

				if (userAnswer == correctAnswer){
					System.out.println("Very Good");
					break;
				} else{
					attempts--;
					if(attempts > 0){
						System.out.println("Opps! You have " + attempts + " attempts left. Try again.");
					} else{
						System.out.println("I'm sorry. No attempts left.");
					}
				}
			}
			System.out.println("Thes Next Question is:  ");
		}
	}
}