public class AsteriksLoop {
	public static void main(String[] AsteriksLoop) {
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++){
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}



public class AsterikLoop1 {
	public static void main(String[] AsterikLoop1) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}	
	}
}




public class AsterikLoop2 {
	public static void main(String[] AsterikLoop2) {
		int n = 5;
		
		for (int i = 1; i < n; i++) {
			for (int j = i; j <= n; j++){
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}	
	}
}


public class AsterikLoop3 {
	public static void main(String[] AsterikLoop3) {
		int n = 5;
		for (int i = 1; i = n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}