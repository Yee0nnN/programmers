package day_18;

import java.util.ArrayList;
import java.util.Arrays;

class Solution2 {
	public String[] solution(String myString) {
		String[] answer = myString.split("x");
		ArrayList<String> list = new ArrayList<>();
		//빈 문자열 검사
		for (String str : answer) {
			if (!str.isEmpty()) {
				list.add(str);
			}
		}
		answer = new String[list.size()];
		list.toArray(answer);
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution("axbxcxdx")));
		System.out.println(Arrays.toString(s.solution("dxccxbbbxaaaa")));
	}
}
