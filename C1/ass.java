a. Public class Exercise3 {
	public static void main(String[] Exercise3){
		System.out.print("Enter first Integer");
	}
}

b & c. public clas multiply{
	public static void main(String[] Multiply) {
	// this program perfroms a sample payroll calculations.

		int b = 0;
		int c = 0;
		int a;

a = b * c;

System.out.printIn("The product of b and c is: ", a);

2.9 a. False: Because addition is not the first expression to be executed first because it comes next after the multiplication, division and reminder due to the fact they
       are not on the same level of precedence.

    b. False : because variables can contain a-z or A-Z, underscores (_), dollar signs $ and digits 0-9. so some variables there are wrong or invalid.
    
    c. False : addition does not have the hughest precedence because it is not on the same level of precedence with division.

    d. False : @, %, ., 99er, 2_ can not be considered as a variable because does not start with digits.

2.10 a.  given that x = 5 and y = 1 
       System.out.printf("x = %d%n", x + 5);
	 x = 5 
	 5 + 5 = 10
     b. System.out.printf("value of %d %d is %d\n", x, y, (x * y) );
        5 * 1 = 5
     c. System.out.printf("x is %d and y is %d", x, y,);
        x = 1  or x is 1
	  y = 5  or y is 5
     d. System.out.printf("%d is not equal to %d%n", (x + y), (x * y));
        (1 + 5) != (1 * 5)
         6 != 5 or 6 is not equal to 5

2.11  All statements are not modified 

2.12  a. y = a * x * x + 5 * x + 2;

2.13.  a. p is inputed into an initialized varaible 
		int p = 5;
     		then printf is to display the result of p + 2 * 4;
    		in the rules of operations the multiplication comes first 
		2 * 4 = 8
            p = 5      5 + 8 = 13
        	 the display will be 13

       b. p is in a variable 
	int p = 5
	 print is daiplay to be p * 2 + 4 
		which is 5 * 2 + 4
       Multiplication comes first 
		5 * 2 = 10
		10 + 4 = 14
		the display will be 14

2.14 a. public class Numbers1 {
	  public static void main(String[] Numbers) {
		System.out.printIn("1 2 3 4");
	  }
        }

     b. public class Numbers2 {
	  public static void main(String[] Numbers) {
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4 ");
	 }
	 }

     c.public class Numbers3 {
	 public static void main(String[] Numbers3) {
		System.out.printf("%d %d %d %d ", 1, 2, 3, 4,);
	 }
	 }

2.15 .import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] Arithmetic) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Integer: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Integer: ");
		int secondNumber = input.nextInt();

		int firstSquare = firstNumber * firstNumber;
		int secondSquare = secondNumber * secondNumber;

		int sumOfSquares = firstSquare + secondSquare;

		int differentOfSquares = firstSquare - secondSquare; 


		System.out.printf("square of %d: %d%n", firstNumber, firstSquare);
		System.out.printf("square of %d: %d%n", secondNumber, secondSquare);
		System.out.printf("sum of squares: %d%n", sumOfSquares);
		System.out.printf("different of squares: %d%n", differentOfSquares);

	}
}

		
2.16. 

2.17. import java.util.Scanner;

	public class ArithmeticSmallestLargest {
		public static void main(String[] ArithmeticSmallestLargest) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter first integer: ");
			int firstNumber = input.nextInt();

			System.out.print("Enter second integer: ");
			int secondNumber = input.nextInt();

			System.out.print("Enter third integer: ");
			int thirdNumber = input.nextInt();

			int sum = firstNumber + secondNumber + thirdNumber;

			int average = sum / 3;

			int product = firstNumber * secondNumber * thirdNumber;

			int smallest = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
			int largest = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));

			System.out.printf("sum %d%n:", sum);
			System.out.printf("average %d%n:", average);
			System.out.printf("product %d%n:", product);
			System.out.printf("smallest %d%n:", smallest);
			System.out.printf("largest %d%n:", largest);

	}
}








