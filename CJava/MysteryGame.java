import java.util.Scanner;
public class MysteryGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Welcome to The Mystery Game!");
		int compInput = (int)((Math.random() * 10) + 1);
		System.out.printf("%d", compInput);


		System.out.println("Predict Your First Trial Score: ");
		int userScore = input.nextInt();
		if (userScore < 1 && userScore > 10) {
			System.out.println("Enter Value Within The range of 1 - 10.");
		} else {
			if (userScore == compInput) {
				System.out.println("Congratulations!. You are coreect!.");
			} else {
				if (userScore < compInput) {
				System.out.println("Too Low, You Failed, Please Try Again.");
					}
				if (userScore > compInput) {
				System.out.println("Too High, You Failed, Please Try Again");
					}
				
				System.out.println("Predict Your Second Trial Score: ");
				int userScore1 = input.nextInt();
				if (userScore1 < 1 && userScore1 > 10) {
					System.out.println("Enter Value Within The range of 1 - 10.");
				} else {
					if (userScore1 == compInput) {
						System.out.println("Congratulations!, You are correct!.");
					} else {
						if (userScore1 < compInput) {
							System.out.println("Too Low, You Failed, Please Try Again.");
							}
						if (userScore1 > compInput) {
							System.out.println("Too High, You Failed, Please Try Again.");
							}
					}

				
				System.out.println("Predict Your Last Trial Score: ");
				int userScore2 = input.nextInt();
				if (userScore2 < 1 && userScore2 > 10) {
					System.out.println("Enter Value Within The range of 1 - 10.");
				} else {
					if (userScore2 == compInput) {
						System.out.println("Congratulations Finally!, You are correct!.");
					} else {
						if (userScore2 < compInput) {
							System.out.println("Too Low, You Failed, Game Over!");
							}
						if (userScore2 > compInput) {
							System.out.println("Too High, You Failed, Game Over!");
							}
					}
				}
				}


					
				}
			
		}
	}	
}