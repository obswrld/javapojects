/*class declaration
main method declaration
import your Scanner
inputing the Scanner system
Enter The Weight Value From The User
place the Weight value in a variable
create and if statement for the condition if the weight is less than the given value print the price */

// import your Scanner 
import java.util.Scanner;

// class declaration
public class Shipping {
	
	// main method declaration
	public static void main(String[] args) {
		
		//inputing the Scanner system
		Scanner input = new Scanner(System.in);

			//Enter The Weight Value From The User
			System.out.print("Enter Weight Value in pounds: ");
			
			// place the value in a variable
			float weight = input.nextFloat();
			
			//create and if statement for the condition if the weight is less than the given value print the price 

			if (weight <= 0) {
				System.out.println("Error");
			}
			if (weight > 0 && weight <= 1) {
				System.out.println("The shipping cost is " + 3.5);
			}
			if (weight > 1 && weight <= 3) {
				System.out.println("The shipping cost is " + 5.5);
			}
			if (weight > 3 && weight <= 10) {
				System.out.println("The shippping cost is " + 8.5);
			}
			if (weight > 10 && weight <= 20) {
				System.out.println("The shipping cost is " + 10.5);
			} 
			if (weight > 20) {
				System.out.println("The package cannot be shipped");
			}


			
	}
}
