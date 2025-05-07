package day_24;

import java.util.Arrays;

class Solution2 {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];

		int idx = 0;
		for (int i = 0; i < picture.length; i++) {
			String str = picture[i];
			String result = "";

			// 가로
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				for (int m = 0; m < k; m++) {
					result += ch;
				}
			}

			// 세로
			for (int n = 0; n < k; n++) {
				answer[idx++] = result;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String[] result = s.solution(new String[] { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..",
				"...x.x...", "....x...." }, 2);

		for (String row : result) {
			System.out.println(row);
		}
	}
}
