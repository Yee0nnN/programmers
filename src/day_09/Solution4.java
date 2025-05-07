package day_09;

import java.util.Arrays;

//04.접미사 배열 
class Solution4 {
	public String[] solution(String my_string) {
		String[] answer = new String[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i);
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution("banana")));
		System.out.println(Arrays.toString(s.solution("programmers")));
	}
}