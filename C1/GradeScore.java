import java.util.Scanner;
public class GradeScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Student Score: ");
		double score = input.nextDouble();
		if (score < 1 && score > 100) {
			System.out.println("Please Enter Valid Score of Student.");
		} else {
			if (score >= 90 && score <= 100) {
				System.out.println("A1");
			}
			if (score >= 70 && score <= 79 ) {
				System.out.println("B2");
			}
			if (score >= 65 && score < 69) {
				System.out.println("B3");
			}

			if (score >= 60 && score <= 64) {
				System.out.prinln("C4");
			}
			if (score >= 55 &&  )
		
		}
































	
	}


}