public class MultiplicationTable {
	public static void main(String[] args) {

		int start = 1;
		int end = 9;
		System.out.print(" ");
		for (int i = start; i <= end; i++ ){
			System.out.printf("%3d", i);
		}
		System.out.println( );

		System.out.println("-----------------------------------------------------------\n");
		System.out.println( );

		for (int i = start; i <= end; i++) {
			System.out.printf("%2d|", i);
			for (int j = start; j <= end; j++){
				System.out.printf("%3d", i * j);
			}
		System.out.println( );
		}
	}
}