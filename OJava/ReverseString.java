public class ReverseString {
	public static void main(String[] args) {
		String str = "oba ";
		String reverseStr = " ";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			reverseStr = ch + reverseStr;
		}
		System.out.println("Rever String is:  " + reverseStr);
	}
}