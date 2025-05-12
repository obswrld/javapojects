import java.util.Scanner;
public class MysteryGameLoop {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.println("Welcome to The Mystery Game!");
		int compInput = (int)((Math.random() * 10) + 1);
		System.out.printf("%d", compInput);
		int trials = 3;
		int guess = 0; 


		while (trials > 0) {
			System.out.println("Enter your First guess: ");
			guess = input.nextInt();

			if (guess < 0 && guess > 10) {
				System.out.println("Please enter the valid number.");
			} else {
				if (guess == compInput) {
					System.out.println("Congrats on your first trial!");

					break;

				} else {
					trials--;
					if (trials > 0) {

						System.out.println("Opps Try again! you have" + trials + "attempts left. Enter your Second guess: ");
						guess = input.nextInt();

						if (guess == compInput) {
							System.out.println("Congrats on your second trial!");

							break;
						} else {
							trials--;
							if (trials > 0) {
								System.out.println("Opps try again! you have" + trials + "attempts left. Enter your Final guess: ");
								guess = input.nextInt();

								if (guess == compInput) {
									System.out.println("Congrats on your last trial!");

									break;
								} else {
									System.out.println("Game Over!");
									break;
								}
							}

							
							}
						}
					}
			}
		}


	}




}