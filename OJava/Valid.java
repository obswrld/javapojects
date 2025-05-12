import java.util.Scanner;
public class Valid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String message = """  
		Welcome! 
		Please Enter Valid Score for Student.
		""";	

		System.out.println(message);
		
		
		int counterA = 0;
		int counterB = 0;
		int counterC = 0;
		int counterD = 0;
		int counterF = 0;
		int invalid = 0;
		
		int count = 0;
		while (count != 10) {
				System.out.println("Enter Student Score Please: ");	
				int score = input.nextInt();
				if (score < 0 || score > 100) {
					System.out.println("Invalid Score");
					invalid = invalid + 1;
				continue;
				}
				
				int trueScore = score / 10;
				switch (trueScore) {
					case 10: 
					case 9: 
					case 8: {
						System.out.println("A"); 
					counterA = counterA + 1;
					break;
					}
					case 7: { 
						System.out.println("B"); 
					counterB = counterB + 1;
					break;
					}
					case 6: {
						System.out.println("C");	
					counterC = counterC + 1;
					break;
					}
					case 5: { 
						System.out.println("D");
					counterD = counterD + 1;
					break;
					}
					
					default : {
						System.out.println("F");
					counterF = counterF + 1;
					}
				}


			

		count = count + 1;
		}
					
					System.out.println("Number of Students That Scored A:   " + counterA);
					System.out.println("Number of Students That Scored B:   " + counterB);
					System.out.println("Number of Students That Scored C:   " + counterC);
					System.out.println("Number of students That Scored D:   " + counterD);
					System.out.println("Number of Students That Scored F:   " + counterF);
					System.out.println("Number of Invalid Scores:   " + invalid);

	}
}