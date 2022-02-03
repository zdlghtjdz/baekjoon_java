package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjoon_1157 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next().toUpperCase();
		int max = 0;
		
		int[] count = new int[26]; //알파벳 개수는 26개
		
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 'A';
			count[num]++;
		}
		
		char answer = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				answer = (char)(i + 'A');
			}else if(count[i] == max) {
				answer = '?';
			}
		}
		System.out.println(answer);
		
	}
	
//	public static void main(String[] args) {
//		
//		Map<Character, Integer> dic = new HashMap<Character, Integer>();
//		Scanner scanner = new Scanner(System.in);
//		char answer = 0;
//		int max = 0;
//		int flag = 0;
//		
//		String s = scanner.next().toUpperCase();
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(dic.containsKey(s.charAt(i))) {
//				dic.put(s.charAt(i), dic.get(s.charAt(i)) + 1);
//			} else {
//				dic.put(s.charAt(i), 1);
//			}		
//		}
//		
//		for(char e : dic.keySet()) {
//
//			System.out.println(dic.get(e));
//
//			if(max < dic.get(e)) {
//				answer = e;
//				max = dic.get(e);
//				flag = 0;
//			}else if(max == dic.get(e)) {
//				flag = 1;
//			}
//		}
//		
//		if(flag == 1) {
//			System.out.println("?");
//		}else {
//			System.out.println(answer);
//		}
//		
//		
//	}
	
}
