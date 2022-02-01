package test;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_4344 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<int[]> array = new ArrayList<>();
		
		int C = scanner.nextInt();
		int sum = 0;
		float average = 0;
		float[] aver_arr = new float[C];
		
		for(int i = 0; i < C; i++) {
			int N = scanner.nextInt();
			sum = 0;
			int[] arr = new int[N];
			for(int j = 0; j < N; j++) {
				arr[j] = scanner.nextInt();
				sum += arr[j];
			}
			array.add(arr);
			average = (float)sum / N;
			aver_arr[i] = average;
		}
		int idx = 0;
		for(float e : aver_arr) {
			int[] tmp = array.get(idx);
			int up = 0;
			for(int i = 0; i < tmp.length; i++) {
				if((float)tmp[i] > e) {
					up++;
				}
				//System.out.println(e);
			}
			System.out.println(String.format("%.3f",(float)up / tmp.length * 100) + "%");
			idx++;
		}
		
		
	}

}
