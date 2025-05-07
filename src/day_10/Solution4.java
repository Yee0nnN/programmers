package day_10;

import java.util.ArrayList;
import java.util.List;

//04.세로 읽기
class Solution4 {
	public String solution(String my_string, int m, int c) {
		List<String> answer = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i += m) {
			String sub = my_string.substring(i, i + m);
			String sub2 = sub.substring(c - 1, c);
			answer.add(sub2);

		}
		return String.join("", answer);

	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("ihrhbakrfpndopljhygc", 4, 2));
		System.out.println(s.solution("programmers", 1, 1));

	}
}