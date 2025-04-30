import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String menu = """
				Welcome to your first calculator !
				1 => Press 1 For Addition
				2 => Press 2 For Substraction
				3 => Prees 3 For Multuplication
				4 => Press 4 For Division
				5 => Press 5 For Square Root
				0 => Press 0 to Exit
				""";

				while (true) {
					System.out.println(menu);
					System.out.println("Please select an option:  ");
					int num = input.nextInt();

					if (num == 0) {
						System.out.println("Exiting.....");
						break;
					}
			
					if (num < 1 || num > 5) {
						System.out.println("Invalid Number. Please enter a valid number from 1 to 4.");
						continue;
					}

					int cal1 = num;
		
					switch (cal1) {
						case 1: {
							addition(input);
							break;
						}
						case 2: {
							substraction(input);
							break;
						}
						case 3: {
							multiplication(input);
							break;
						}
						case 4: {
							division(input);
							break;
						}
						case 5: {
							squareroot(input);
						}
					}
				}// while loop for the menu
	}//main method
	

	public static void addition(Scanner input) {
		String add = """
				Welcome to the Addition Section:
				0 => Back to the menu 
				""";
				
				System.out.println(add);

				while (true) {
					System.out.println("Enter the first Integer:  ");
					int num1 = input.nextInt();
					
					if (num1 == 0) {
						break;
					}

					System.out.println("Enter the second Integer:  ");
					int num2 = input.nextInt(); 

					int sum = num1 + num2;
					System.out.println("The sum of both Integers:  " + sum);
				}// while loop for add method 
	}// add method 


	public static void substraction(Scanner input) {
		String sub = """
				Welcome to the Substraction Section:
				0 => Back to the menu 
				""";
				
				System.out.println(sub);

				while (true) {
					System.out.println("Enter the first Integer:  ");
					int num1 = input.nextInt();
					
					if (num1 == 0) {
						break;
					} 

					System.out.println("Enter the second Integer:  ");
					int num2 = input.nextInt();

					int diff = num1 - num2;
					System.out.println("The difference of both Integers:  " + diff);
				}// while loop for sub method 
	}// sub method


	public static void multiplication(Scanner input) {
		String mul = """
				Welcome to the Multiplication Section:
				0 => Back to the menu 
				""";
				
				System.out.println(mul);

				while (true) {
					System.out.println("Enter the first Integer:  ");
					int num1 = input.nextInt();
					
					if (num1 == 0) {
						break;
					} 

					System.out.println("Enter the second Integer:  ");
					int num2 = input.nextInt();

					int off = num1 * num2;
					System.out.println("The difference of both Integers:  " + off);
				}// while loop for mul method 
	}// mul method


	public static void division(Scanner input) {
		String divs = """
				Welcome to the Division Section:
				0 => Back to the menu 
				""";
				
				System.out.println(divs);

				while (true) {
					System.out.println("Enter the first Integer:  ");
					int num1 = input.nextInt();
					
					if (num1 == 0) {
						break;
					}

					System.out.println("Enter the second Integer:  ");
					int num2 = input.nextInt(); 

					double div = (double) num1 / num2;
					System.out.println("The division of both Integers:  " + div);
				}// while loop for divs method 
	}// divs method

	
	public static void squareroot(Scanner input) {
		String sqrts = """
				Welcome to the Square Root Section:
				0 => Back to the menu 
				""";
				
				System.out.println(sqrts);

				while (true) {
					System.out.println("Enter the first Integer:  ");
					int num1 = input.nextInt();
					
					if (num1 == 0) {
						break;
					}

					double sqrt = (double) Math.sqrt(num1);
					System.out.println("The Squar root of the Integer:  " + sqrt);
				}// while loop for sqrts method 
	}// sqrts method


}