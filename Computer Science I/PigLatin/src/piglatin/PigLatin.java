package piglatin;

public class PigLatin {
	
	public static String convertWord(String word) {
		word = word.toLowerCase();
		
		int firstvowel=0;
		for(int i = 0; i<word.length();i++) {
			char letter = word.charAt(i);
			
			if( letter == 'a' || letter == 'e' || letter == 'i' ||
				letter == 'o' || letter == 'u' ) {
					firstvowel = i;
					break;
			}
		}
		String consonants = word.substring(0, firstvowel);
		String restOfWord = word.substring(firstvowel);
		
		String Pigword = "";
		if(firstvowel==0) {
			Pigword = word + "-pay";
		}
		else {
			Pigword = restOfWord +"-"+consonants+"ay";
		}
		return Pigword;
	}
	public static void main(String[] args) {
		
	}
}