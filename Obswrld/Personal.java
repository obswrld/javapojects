import java.util.Scanner;
public class Personal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("Welcome To The Guessing Game:  ");
			int comp = (int)((Math.random() * 100) + 1);

			
			int user = 0;
			
			while (true) {

				System.out.println("Guess Your Number:   ");
				user = input.nextInt();

				
				if (user < 1 || user > 100) {
					System.out.println("Error. Enter number from 1 - 10");
				} else {
					if (user > comp) {
						System.out.println("Too High!");
					}
					else if (user < comp) {
						System.out.println("Too Low!");
					} else {
						if (user == comp) {
							System.out.println("Correct, Bravo!!!");
							break;
						}
					}
				}
			}
	}
}