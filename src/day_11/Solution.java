package day_11;

import java.util.Arrays;

public class Solution {
	public int[] solution(String my_string) {
		int[] answer = new int[52];

		for (int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);

			if (ch >= 'A' && ch <= 'Z') { // 대문자
				answer[ch - 'A']++;
			} else if (ch >= 'a' && ch <= 'z') {  //소문자
				answer[ch - 'a' + 26]++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution("Programmers")));
	}
}
