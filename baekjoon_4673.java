package baekjoon;

public class baekjoon_4673 {

	public static void main(String[] args) {
		
		int[] arr = new int[10001];
		String s = "";
		arr[1] = 0;
		
		for(int i = 1; i < 10001; i++) {
			s = Integer.toString(i);
			int result = i;
			for(int j = 0; j < s.length() ; j++ ) {
				result += Character.getNumericValue(s.charAt(j)); 
			}
			if(result < 10001) {
				arr[result] += 1;
			}
			
		}
		
		for(int i = 1; i < 10001; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
	}
	
	
}
