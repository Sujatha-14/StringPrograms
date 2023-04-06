package Stringprogram;

import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the word you want");
		String name=src.next();
		int count=0;
		System.out.println("Enter you find value");
		char findvalue=src.next().charAt(0); 
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==findvalue) {
				count++;
				
			}
		}
		System.out.println("the value of the count: "+ count);
		

	}

}
