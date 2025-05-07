package day_16;

import java.util.Arrays;

class Solution3 {
	public String[] solution(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 == 0) {
				strArr[i] = strArr[i].toLowerCase();
			} else {
				strArr[i] = strArr[i].toUpperCase();
			}
		}
		return strArr;
	}
	
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(Arrays.toString(s.solution(new String[] { "AAA","BBB","CCC","DDD" })));
	}
}
