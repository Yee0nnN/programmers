package day_18;

import java.util.Arrays;

class Solution {
	public int[] solution(String myString) {
		//-1 : 빈 문자열도 다 살려라 
		String[] str = myString.split("x", -1);
		int[] answer = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			answer[i] = str[i].length();
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution("oxooxoxxox")));
		System.out.println(Arrays.toString(s.solution("xabcxdefxghi")));
	}
}
