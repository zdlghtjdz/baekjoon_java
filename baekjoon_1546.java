package test;

import java.util.Scanner;

public class baekjoon_1546 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		int input = -1;
		int max = -1;
		float sum = 0;
		
		for(int i = 0; i < N; i++) {
			input = scanner.nextInt();
			if(max < input) {
				max = input;
			}
			arr[i] = input;
		}
		
		for(int a : arr) {
			sum += ((float)a / max) * 100;
			//System.out.println(sum);
		}
		
		float answer = sum / arr.length;
		System.out.println(answer);
	}

}
