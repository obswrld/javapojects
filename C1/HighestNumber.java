import java.util.Scanner;
public class HighestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int count = 1;
		int max = -76655;
		int counter = 0;

		System.out.println("Enter the Integers: ");
		int number = input.nextInt();

		while (counter != 996655) {
			if (number > max) {
				count = 1;
			} else if (number == max) {
				count = count + 1;
			}
			counter = counter + 1;

			System.out.println("Enter integer or Press no to quit: ");
			number = input.nextInt(); 
			String yes = input.nextLine();
			
			if (yes.equals ("yes") || yes.equals ("Yes") ){
				System.out.print("Do you wish to continue ? if not press yes. Enter an Integer:  ");
				yes = input.nextLine();
				String no = input.nextLine();
			} else {
				break;				
			}
							
			
			

		}

			System.out.printf("The Largest Numbers are: %d%n" , count);
			System.out.printf("The highest occuring integers are: %d%n" , counter);

				
		


	}
}