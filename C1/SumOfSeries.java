public class SumOfSeries {
	public static void main(String[] args) {
		System.out.println("n\t Sum");
		
		for (int n = 1; n <= 100; n++) {
			long sum = (long) n * (n + 1) / 2;
			System.out.println(n + "\t" + sum);
		}
	}
}