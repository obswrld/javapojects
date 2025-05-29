public class LetterCount{
	public static int letterCount(String word, char alpha){
		word = word.toLowerCase();
		int stringCount = 0;

		for(int count = 0; count < word.length(); count++){
			if(word.charAt(count) == alpha){
				stringCount++;
			}
		}
		return stringCount;
	}
}