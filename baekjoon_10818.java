package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class baekjoon_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//시간 복잡도 N^2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int input;
//		int idx = 0;
//		int N = Integer.parseInt(br.readLine());
//		int[] arr = new int[N];
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		while(st.hasMoreTokens()) {
//			input = Integer.parseInt(st.nextToken());
//			arr[idx] = input;
//			idx++;
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(arr[0] + " " + arr[arr.length - 1]);
		
		//배열 사용하지 않음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1000001;
		int min = 1000001;
		int input;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			input = Integer.parseInt(st.nextToken());
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}

		}
		
		System.out.println(min + " " + max);
	}

}
