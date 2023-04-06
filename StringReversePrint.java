package Workout;

import java.util.Scanner;

public class StringReversePrint {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter your mobile no");
	String mobileNo=src.next();
		long phoneNo=0;
		for(long i=0;i<mobileNo.length();i++) {
			long number=mobileNo.charAt((int) i)-48;
			phoneNo=phoneNo*10+number;
			
		}
		System.out.println(phoneNo);
		
		long reverse=0;
		long givenNo=phoneNo;
		while(givenNo>0) {
				reverse=(reverse*10)+givenNo%10;
				givenNo= givenNo/10;
			}
		System.out.println(reverse);
			

	}

}
