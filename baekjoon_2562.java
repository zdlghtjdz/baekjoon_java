package test;

import java.util.Scanner;

public class baekjoon_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		int max = 0;
		int input;
		int idx = 0;
		for(int i = 0; i < 9; i++) {
			input = scanner.nextInt();
			if(max < input) {
				max = input;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx+1);
		
	}

}
