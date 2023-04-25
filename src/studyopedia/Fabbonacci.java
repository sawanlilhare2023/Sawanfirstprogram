package studyopedia;

import java.util.Scanner;

public class Fabbonacci {

	private static Scanner sc;
	public static void main(String[] args) {
		int n1,n2,n3;
		sc = new Scanner(System.in);
		System.out.println("Enter the number upto which fabbonacci series you want to print");
		sc.nextInt();
		
		n1= 0;
		n2=1;
		System.out.println(n1);
		System.out.println(n2);
				
		for (int i = 2; i < 10; i++){
			 n3 = n1+n2;
			 System.out.println(n3);
			 n1=n2;
			 n2=n3;
			 
			
			}
	}

}
