package day_11;

import java.util.Arrays;

class Solution3 {
	public String solution(String my_string, int[] indices) {
		String answer = "";
		Arrays.sort(indices);

		int idx = 0;
		for (int i = 0; i < my_string.length(); i++) {
			if (idx < indices.length && i == indices[idx]) {
				idx++;
				continue;
			} else {
				answer += my_string.charAt(i);
			}
		}return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.printf(s.solution("apporoograpemmemprs", new int[] { 1, 16, 6, 15, 0, 10, 11, 3 }));
	}
}
