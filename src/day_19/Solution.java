package day_19;

import java.util.Arrays;

class Solution {
	public String[] solution(String myStr) {
		String[] answer = myStr.replace("a", " ").replace("b", " ").replace("c", " ").split(" ");
		String[] result = new String[answer.length];
		int idx = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i].equals("")) {
				continue;
			} else {
				result[idx++] = answer[i];
			}
		}
		result = Arrays.copyOf(result, idx);
		if (result.length == 0) {
			result = new String[] { "EMPTY" };
		}

		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution("baconlettucetomato")));
		System.out.println(Arrays.toString(s.solution("abcd")));
		System.out.println(Arrays.toString(s.solution("cabab")));
	}
}
