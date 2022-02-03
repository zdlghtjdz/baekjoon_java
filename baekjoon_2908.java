package String;

import java.util.Scanner;

public class baekjoon_2908 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int rev_a = (a % 10) * 100 + ((a / 10) % 10) * 10 + (a / 100);
		int rev_b = (b % 10) * 100 + ((b / 10) % 10) * 10 + (b / 100);
		
		if(rev_a > rev_b) {
			System.out.println(rev_a);
		}
		else {
			System.out.println(rev_b);
		}
		
	
	}

}
