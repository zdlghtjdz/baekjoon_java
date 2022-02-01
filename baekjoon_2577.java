package test;

import java.util.Scanner;

public class baekjoon_2577 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int[] arr = new int[10];
		
		int number = A*B*C;
		String output = Integer.toString(number);
		//System.out.println(output.charAt(0));
		
		for(int i = 0; i < output.length(); i++) {
			arr[(int)(output.charAt(i) - '0')] += 1;

		}
		
		for(int e : arr) {
			System.out.println(e);
		}
		
	}

}
