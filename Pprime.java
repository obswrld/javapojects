public class Pprime {
	public static void main(String[] args) {


 	 	for (int count = 1; count < 10; count++) {
			if (count % 2 != 0 && count % 1 == 0 && count % count == 0) {
				System.out.println(count + " is a prime number");
			} 
	}

	}
}