package Stringprogram;

public class StringCheckSequenceOfCharacter {

	public static void main(String[] args) {
		
		String everything="everything";
		String nothing="nothing";
		String something="something";
		String anything="anything";
		String things="things";
		sequencecheck(everything);
		sequencecheck(nothing);
		sequencecheck(something);
		sequencecheck(anything);
		sequencecheck(things);

	}
static void sequencecheck(String word) {
	String thin="";
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)=='t') {
		thin=""+word.charAt(i)+word.charAt(i+1)+word.charAt(i+2)+word.charAt(i+3);
		if(thin.equals(thin)) {
			System.out.println("This is contain thin");
		}
		else {
			System.out.println("This is  not contain thin");
		}
	}
	}
}
}
