package recursionbasics;

import java.util.Scanner;

public class SumOfDigits {
	
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		
		return n%10+sum(n/10);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		System.out.println(sum(n));


	}

}
