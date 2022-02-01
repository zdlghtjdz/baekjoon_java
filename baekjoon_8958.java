package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_8958 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int result = 0;
		int[] arr = new int[N];
		String s = "";
		
		for(int i = 0; i < N; i++) {
			result = 0;
			StringTokenizer st = new StringTokenizer(scanner.next(), "X");
			while(st.hasMoreTokens()) {
				s = st.nextToken();
				//System.out.print(s + " ");
				result += s.length() * (s.length() + 1) / 2;
			}
			//System.out.println();
			arr[i] = result;
		}
		
		for(int e : arr) {
			System.out.println(e);
		}
		
	}

}
