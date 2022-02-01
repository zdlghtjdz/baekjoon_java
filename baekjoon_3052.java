package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjoon_3052 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
		int input = 0;
		
		
		for(int i = 0; i < 10; i++) {
			input = scanner.nextInt();
			if(dic.containsKey(input%42)) {
				dic.put(input%42, dic.get(input%42)+1);
			}else {
				dic.put(input%42, 1);
			}
		}
		
		System.out.println(dic.size());
				
		
	}

}
