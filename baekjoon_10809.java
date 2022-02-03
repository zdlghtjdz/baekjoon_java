package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjoon_10809 {

	public static void main(String[] args) {
		
		Map<Character, Integer> dic = new HashMap<>();
		
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i = 0; i < arr.length; i++) {
			dic.put(arr[i], -1);
		}
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		for(int i = 0; i < s.length(); i++) {
			
			if(dic.get(s.charAt(i)) == -1) {
				dic.put(s.charAt(i), i);
			}

		}
		
		for(char e : arr) {
			System.out.print(dic.get(e) + " ");
		}
		
		
	}

}
