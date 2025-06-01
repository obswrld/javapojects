public class Radius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Radius of the circle: ");
		double radius = input.nextDouble();

		System.out.printf("Diameter is %.2f%n ", 2.0 * radius);
		System.out.printf("Circumeference is %.2f%n ", 2.0 * Math.PI * radius);
		System.out.printf("Area is %.2f%n ", Math.PI * radius * radius);
	}
}