package studyopedia;

import java.util.Scanner;

public class PrimeNumber {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the number");
		int no=s.nextInt(); 
		int temp=0;
		for(int i=2;i<=no-1;i++) {
			if (no%i==0) {
				
				temp=temp+1;
				
			}	
		}
		if (temp==0) {
			System.out.println(no+" is prime number");
		}
		else {
			System.out.println(no+ "is not prime number");
		}
    }
}
