package Stringprogram;
import java.util.Scanner;
public class StringCompare {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter two strings");
		String a1=src.next();
		String a2=src.next();
		boolean equal=false;
		if(a1.length()==a2.length()) {
			for(int i=0;i<a1.length();i++) {
				if(a1.charAt(i)==a2.charAt(i))
			//if(a1.charAt(i)==a2.charAt(i))||(a1.charAt(i)-32==a2.charAt(i))||(a1.charAt(i)==a2.charAt(i)-32)
				{
					equal=true;
				}
				else {
					equal=false;
					break;
				}
			}
			if(equal) {
				System.out.println("Two strings are same");
			}
			else {
				System.out.println("The size is same but the value is different");
			}
		}
		else {
			System.out.println("There are different words");
		}
	}

}
