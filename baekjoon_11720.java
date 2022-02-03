package String;

import java.util.Scanner;

public class baekjoon_11720 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int sum = 0;
		
		String s = scanner.next();
		for(int i = 0; i < s.length(); i ++) {
			sum += Character.getNumericValue(s.charAt(i));
		}
		
		System.out.println(sum);
	}

}
