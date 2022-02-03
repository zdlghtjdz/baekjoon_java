package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjoon_5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toUpperCase();
		int sum = 0;

		Map<Character, Integer> dic = new HashMap<>();
		char start = 'A';
		
		for(int i = 0; i < 8; i ++) {
			if(i == 5 || i == 7) {
				for(int j = 0; j < 4; j++) {
					dic.put(start++, 3+i);
				}
			} else {
				for(int j = 0; j < 3; j++) {
					dic.put(start++, 3+i);
				}
			}
		}
			
//		for(char e : dic.keySet()) {
//			System.out.print(dic.get(e));
//		}
		
		for(int i = 0; i < s.length(); i++) {
			sum += dic.get(s.charAt(i));
		}
		
		System.out.println(sum);
		
	}

}
