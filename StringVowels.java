package Stringprogram;
import java.util.Scanner;
public class StringVowels {

			public static void main(String[] args) {
				int count=0;
				String word="the quick brown fox jumps over the lazy dog";
				for(int i=0;i<word.length();i++) {
					if(word.charAt(i)=='a'|word.charAt(i)=='e'|word.charAt(i)=='i'|word.charAt(i)=='o'|word.charAt(i)=='u') {
						count++;
						
					}
				}
				System.out.println("Number of the vowels : "+ count);
				

	}

}
