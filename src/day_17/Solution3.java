package day_17;

import java.util.Arrays;

class Solution3 {
	public String[] solution(String[] strArr) {
		String[] answer = new String[strArr.length];
		int idx = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].contains("ad") == true) {
				continue;
			} else {
				answer[idx++] = strArr[i];
			}
		}
		answer = Arrays.copyOf(answer, idx);
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(Arrays.toString(s.solution(new String[] { "and", "notad", "abcd" })));
	}
}
