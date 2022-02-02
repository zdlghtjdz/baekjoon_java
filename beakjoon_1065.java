package baekjoon;

import java.util.Scanner;

public class beakjoon_1065 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer = 99;
		
		if(N < 100) {
			System.out.println(N);
		} else {
			//System.out.println("else¹®");
			for(int i = 100; i <= N; i++) {
				int hund = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hund - ten) == (ten - one)) {
					answer += 1;
					//System.out.println("+1");
				}
			}
			
			System.out.println(answer);
		}
		
	}
}
