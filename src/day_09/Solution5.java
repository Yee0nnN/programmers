package day_09;

import java.util.Arrays;

//05.접미사인지 확인하기
class Solution5 {
	public int solution(String my_string, String is_suffix) {
		int answer = 0;

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.substring(i).equals(is_suffix)) {
				answer = 1;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution("banana", "ana"));
		System.out.println(s.solution("banana", "nan"));
		System.out.println(s.solution("banana", "wxyz"));
		System.out.println(s.solution("banana", "abanana"));

	}
}