package String;

import java.util.Scanner;

public class baekjoon_2675 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String sum = "";
		
		int T = scanner.nextInt();

		for(int i = 0; i < T; i++) {
			int a = scanner.nextInt();
			String s = scanner.next();
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < a; k++) {
					sum += Character.toString(s.charAt(j));
				}
			}
			System.out.println(sum);
			sum = "";
		}
		
	}
}
