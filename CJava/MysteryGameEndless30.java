import java.util.Scanner;
public class MysteryGameEndless30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int compInput = (int) ((Math.random() * 10) + 1);
		int guess = 0;
		int trial = 0;
		

		while (true) {
			System.out.println("Enter Your Number: ");
			guess = input.nextInt();
			trial = trial + 1;
		
			if (guess < 0 && guess > 10) {
				System.out.println("Sorry invalid number.");
			} else {
				if (guess < compInput) {
					System.out.println("Opps! too low. try again.");
				} else if ( guess > compInput) {
						System.out.println("Opps! too high. try again.");
						} else{
							if (guess == compInput) {
								System.out.println("Congrats you got it right!!!.");
								break;
							}
						} 


						if (trial % 20 == 0) {
							System.out.println("Game Over!");
						break;
							
						}
				}
		}
	}
}
	


